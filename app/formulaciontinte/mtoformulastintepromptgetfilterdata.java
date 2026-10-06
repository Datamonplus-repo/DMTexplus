package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mtoformulastintepromptgetfilterdata extends GXProcedure
{
   public mtoformulastintepromptgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mtoformulastintepromptgetfilterdata.class ), "" );
   }

   public mtoformulastintepromptgetfilterdata( int remoteHandle ,
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
      mtoformulastintepromptgetfilterdata.this.aP5 = new String[] {""};
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
      mtoformulastintepromptgetfilterdata.this.AV30DDOName = aP0;
      mtoformulastintepromptgetfilterdata.this.AV28SearchTxt = aP1;
      mtoformulastintepromptgetfilterdata.this.AV29SearchTxtTo = aP2;
      mtoformulastintepromptgetfilterdata.this.aP3 = aP3;
      mtoformulastintepromptgetfilterdata.this.aP4 = aP4;
      mtoformulastintepromptgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV33Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV36OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV38OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_FORSER") == 0 )
      {
         /* Execute user subroutine: 'LOADFORSEROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_FORSERDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFORSERDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_FORCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADFORCOLNOMOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_FORNOMCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADFORNOMCLIOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV34OptionsJson = AV33Options.toJSonString(false) ;
      AV37OptionsDescJson = AV36OptionsDesc.toJSonString(false) ;
      AV39OptionIndexesJson = AV38OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV41Session.getValue("FormulacionTinte.MtoFormulasTintePromptGridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.MtoFormulasTintePromptGridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV41Session.getValue("FormulacionTinte.MtoFormulasTintePromptGridState"), null, null);
      }
      AV58GXV1 = 1 ;
      while ( AV58GXV1 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV58GXV1));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV46FilterFullText = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV10TFCliNom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV11TFCliNom_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV12TFForSer = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV13TFForSer_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV14TFForSerDsc = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC_SEL") == 0 )
         {
            AV15TFForSerDsc_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV16TFForColNom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV17TFForColNom_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV18TFForColNum = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFForColNum_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV20TFTipColCod = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFTipColCod_To = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNOMCLI") == 0 )
         {
            AV22TFForNomCli = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNOMCLI_SEL") == 0 )
         {
            AV23TFForNomCli_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNUMCLI") == 0 )
         {
            AV24TFForNumCli = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFForNumCli_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORFEC") == 0 )
         {
            AV26TFForFec = localUtil.ctod( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV47EmprCod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV58GXV1 = (int)(AV58GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFCliNom = AV28SearchTxt ;
      AV11TFCliNom_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV46FilterFullText ,
                                           AV11TFCliNom_Sel ,
                                           AV10TFCliNom ,
                                           AV13TFForSer_Sel ,
                                           AV12TFForSer ,
                                           AV15TFForSerDsc_Sel ,
                                           AV14TFForSerDsc ,
                                           AV17TFForColNom_Sel ,
                                           AV16TFForColNom ,
                                           Integer.valueOf(AV18TFForColNum) ,
                                           Integer.valueOf(AV19TFForColNum_To) ,
                                           Byte.valueOf(AV20TFTipColCod) ,
                                           Byte.valueOf(AV21TFTipColCod_To) ,
                                           AV23TFForNomCli_Sel ,
                                           AV22TFForNomCli ,
                                           Integer.valueOf(AV24TFForNumCli) ,
                                           Integer.valueOf(AV25TFForNumCli_To) ,
                                           AV26TFForFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A1191ForNomCli ,
                                           Integer.valueOf(A1192ForNumCli) ,
                                           A485ForFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN
                                           }
      });
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV10TFCliNom = GXutil.padr( GXutil.rtrim( AV10TFCliNom), 30, "%") ;
      lV12TFForSer = GXutil.padr( GXutil.rtrim( AV12TFForSer), 16, "%") ;
      lV14TFForSerDsc = GXutil.padr( GXutil.rtrim( AV14TFForSerDsc), 26, "%") ;
      lV16TFForColNom = GXutil.padr( GXutil.rtrim( AV16TFForColNom), 13, "%") ;
      lV22TFForNomCli = GXutil.padr( GXutil.rtrim( AV22TFForNomCli), 13, "%") ;
      /* Using cursor P09EJ2 */
      pr_default.execute(0, new Object[] {lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV10TFCliNom, AV11TFCliNom_Sel, lV12TFForSer, AV13TFForSer_Sel, lV14TFForSerDsc, AV15TFForSerDsc_Sel, lV16TFForColNom, AV17TFForColNom_Sel, Integer.valueOf(AV18TFForColNum), Integer.valueOf(AV19TFForColNum_To), Byte.valueOf(AV20TFTipColCod), Byte.valueOf(AV21TFTipColCod_To), lV22TFForNomCli, AV23TFForNomCli_Sel, Integer.valueOf(AV24TFForNumCli), Integer.valueOf(AV25TFForNumCli_To), AV26TFForFec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9EJ2 = false ;
         A396EmprCod = P09EJ2_A396EmprCod[0] ;
         A279CliNom = P09EJ2_A279CliNom[0] ;
         A485ForFec = P09EJ2_A485ForFec[0] ;
         n485ForFec = P09EJ2_n485ForFec[0] ;
         A1192ForNumCli = P09EJ2_A1192ForNumCli[0] ;
         n1192ForNumCli = P09EJ2_n1192ForNumCli[0] ;
         A1191ForNomCli = P09EJ2_A1191ForNomCli[0] ;
         n1191ForNomCli = P09EJ2_n1191ForNomCli[0] ;
         A831TipColCod = P09EJ2_A831TipColCod[0] ;
         A483ForColNum = P09EJ2_A483ForColNum[0] ;
         A482ForColNom = P09EJ2_A482ForColNom[0] ;
         A5742ForSerDsc = P09EJ2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09EJ2_n5742ForSerDsc[0] ;
         A494ForSer = P09EJ2_A494ForSer[0] ;
         A252CliCod = P09EJ2_A252CliCod[0] ;
         A279CliNom = P09EJ2_A279CliNom[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09EJ2_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk9EJ2 = false ;
            A396EmprCod = P09EJ2_A396EmprCod[0] ;
            A831TipColCod = P09EJ2_A831TipColCod[0] ;
            A483ForColNum = P09EJ2_A483ForColNum[0] ;
            A482ForColNom = P09EJ2_A482ForColNom[0] ;
            A494ForSer = P09EJ2_A494ForSer[0] ;
            A252CliCod = P09EJ2_A252CliCod[0] ;
            AV40count = (long)(AV40count+1) ;
            brk9EJ2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV32Option = A279CliNom ;
            AV33Options.add(AV32Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9EJ2 )
         {
            brk9EJ2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFORSEROPTIONS' Routine */
      returnInSub = false ;
      AV12TFForSer = AV28SearchTxt ;
      AV13TFForSer_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV46FilterFullText ,
                                           AV11TFCliNom_Sel ,
                                           AV10TFCliNom ,
                                           AV13TFForSer_Sel ,
                                           AV12TFForSer ,
                                           AV15TFForSerDsc_Sel ,
                                           AV14TFForSerDsc ,
                                           AV17TFForColNom_Sel ,
                                           AV16TFForColNom ,
                                           Integer.valueOf(AV18TFForColNum) ,
                                           Integer.valueOf(AV19TFForColNum_To) ,
                                           Byte.valueOf(AV20TFTipColCod) ,
                                           Byte.valueOf(AV21TFTipColCod_To) ,
                                           AV23TFForNomCli_Sel ,
                                           AV22TFForNomCli ,
                                           Integer.valueOf(AV24TFForNumCli) ,
                                           Integer.valueOf(AV25TFForNumCli_To) ,
                                           AV26TFForFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A1191ForNomCli ,
                                           Integer.valueOf(A1192ForNumCli) ,
                                           A485ForFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN
                                           }
      });
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV10TFCliNom = GXutil.padr( GXutil.rtrim( AV10TFCliNom), 30, "%") ;
      lV12TFForSer = GXutil.padr( GXutil.rtrim( AV12TFForSer), 16, "%") ;
      lV14TFForSerDsc = GXutil.padr( GXutil.rtrim( AV14TFForSerDsc), 26, "%") ;
      lV16TFForColNom = GXutil.padr( GXutil.rtrim( AV16TFForColNom), 13, "%") ;
      lV22TFForNomCli = GXutil.padr( GXutil.rtrim( AV22TFForNomCli), 13, "%") ;
      /* Using cursor P09EJ3 */
      pr_default.execute(1, new Object[] {lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV10TFCliNom, AV11TFCliNom_Sel, lV12TFForSer, AV13TFForSer_Sel, lV14TFForSerDsc, AV15TFForSerDsc_Sel, lV16TFForColNom, AV17TFForColNom_Sel, Integer.valueOf(AV18TFForColNum), Integer.valueOf(AV19TFForColNum_To), Byte.valueOf(AV20TFTipColCod), Byte.valueOf(AV21TFTipColCod_To), lV22TFForNomCli, AV23TFForNomCli_Sel, Integer.valueOf(AV24TFForNumCli), Integer.valueOf(AV25TFForNumCli_To), AV26TFForFec});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9EJ4 = false ;
         A396EmprCod = P09EJ3_A396EmprCod[0] ;
         A494ForSer = P09EJ3_A494ForSer[0] ;
         A485ForFec = P09EJ3_A485ForFec[0] ;
         n485ForFec = P09EJ3_n485ForFec[0] ;
         A1192ForNumCli = P09EJ3_A1192ForNumCli[0] ;
         n1192ForNumCli = P09EJ3_n1192ForNumCli[0] ;
         A1191ForNomCli = P09EJ3_A1191ForNomCli[0] ;
         n1191ForNomCli = P09EJ3_n1191ForNomCli[0] ;
         A831TipColCod = P09EJ3_A831TipColCod[0] ;
         A483ForColNum = P09EJ3_A483ForColNum[0] ;
         A482ForColNom = P09EJ3_A482ForColNom[0] ;
         A5742ForSerDsc = P09EJ3_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09EJ3_n5742ForSerDsc[0] ;
         A279CliNom = P09EJ3_A279CliNom[0] ;
         A252CliCod = P09EJ3_A252CliCod[0] ;
         A279CliNom = P09EJ3_A279CliNom[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09EJ3_A494ForSer[0], A494ForSer) == 0 ) )
         {
            brk9EJ4 = false ;
            A396EmprCod = P09EJ3_A396EmprCod[0] ;
            A831TipColCod = P09EJ3_A831TipColCod[0] ;
            A483ForColNum = P09EJ3_A483ForColNum[0] ;
            A482ForColNom = P09EJ3_A482ForColNom[0] ;
            A252CliCod = P09EJ3_A252CliCod[0] ;
            AV40count = (long)(AV40count+1) ;
            brk9EJ4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A494ForSer)==0) )
         {
            AV32Option = A494ForSer ;
            AV33Options.add(AV32Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9EJ4 )
         {
            brk9EJ4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFORSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFForSerDsc = AV28SearchTxt ;
      AV15TFForSerDsc_Sel = "" ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV46FilterFullText ,
                                           AV11TFCliNom_Sel ,
                                           AV10TFCliNom ,
                                           AV13TFForSer_Sel ,
                                           AV12TFForSer ,
                                           AV15TFForSerDsc_Sel ,
                                           AV14TFForSerDsc ,
                                           AV17TFForColNom_Sel ,
                                           AV16TFForColNom ,
                                           Integer.valueOf(AV18TFForColNum) ,
                                           Integer.valueOf(AV19TFForColNum_To) ,
                                           Byte.valueOf(AV20TFTipColCod) ,
                                           Byte.valueOf(AV21TFTipColCod_To) ,
                                           AV23TFForNomCli_Sel ,
                                           AV22TFForNomCli ,
                                           Integer.valueOf(AV24TFForNumCli) ,
                                           Integer.valueOf(AV25TFForNumCli_To) ,
                                           AV26TFForFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A1191ForNomCli ,
                                           Integer.valueOf(A1192ForNumCli) ,
                                           A485ForFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN
                                           }
      });
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV10TFCliNom = GXutil.padr( GXutil.rtrim( AV10TFCliNom), 30, "%") ;
      lV12TFForSer = GXutil.padr( GXutil.rtrim( AV12TFForSer), 16, "%") ;
      lV14TFForSerDsc = GXutil.padr( GXutil.rtrim( AV14TFForSerDsc), 26, "%") ;
      lV16TFForColNom = GXutil.padr( GXutil.rtrim( AV16TFForColNom), 13, "%") ;
      lV22TFForNomCli = GXutil.padr( GXutil.rtrim( AV22TFForNomCli), 13, "%") ;
      /* Using cursor P09EJ4 */
      pr_default.execute(2, new Object[] {lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV10TFCliNom, AV11TFCliNom_Sel, lV12TFForSer, AV13TFForSer_Sel, lV14TFForSerDsc, AV15TFForSerDsc_Sel, lV16TFForColNom, AV17TFForColNom_Sel, Integer.valueOf(AV18TFForColNum), Integer.valueOf(AV19TFForColNum_To), Byte.valueOf(AV20TFTipColCod), Byte.valueOf(AV21TFTipColCod_To), lV22TFForNomCli, AV23TFForNomCli_Sel, Integer.valueOf(AV24TFForNumCli), Integer.valueOf(AV25TFForNumCli_To), AV26TFForFec});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9EJ6 = false ;
         A396EmprCod = P09EJ4_A396EmprCod[0] ;
         A5742ForSerDsc = P09EJ4_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09EJ4_n5742ForSerDsc[0] ;
         A485ForFec = P09EJ4_A485ForFec[0] ;
         n485ForFec = P09EJ4_n485ForFec[0] ;
         A1192ForNumCli = P09EJ4_A1192ForNumCli[0] ;
         n1192ForNumCli = P09EJ4_n1192ForNumCli[0] ;
         A1191ForNomCli = P09EJ4_A1191ForNomCli[0] ;
         n1191ForNomCli = P09EJ4_n1191ForNomCli[0] ;
         A831TipColCod = P09EJ4_A831TipColCod[0] ;
         A483ForColNum = P09EJ4_A483ForColNum[0] ;
         A482ForColNom = P09EJ4_A482ForColNom[0] ;
         A494ForSer = P09EJ4_A494ForSer[0] ;
         A279CliNom = P09EJ4_A279CliNom[0] ;
         A252CliCod = P09EJ4_A252CliCod[0] ;
         A279CliNom = P09EJ4_A279CliNom[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09EJ4_A5742ForSerDsc[0], A5742ForSerDsc) == 0 ) )
         {
            brk9EJ6 = false ;
            A396EmprCod = P09EJ4_A396EmprCod[0] ;
            A831TipColCod = P09EJ4_A831TipColCod[0] ;
            A483ForColNum = P09EJ4_A483ForColNum[0] ;
            A482ForColNom = P09EJ4_A482ForColNom[0] ;
            A494ForSer = P09EJ4_A494ForSer[0] ;
            A252CliCod = P09EJ4_A252CliCod[0] ;
            AV40count = (long)(AV40count+1) ;
            brk9EJ6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A5742ForSerDsc)==0) )
         {
            AV32Option = A5742ForSerDsc ;
            AV33Options.add(AV32Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9EJ6 )
         {
            brk9EJ6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADFORCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFForColNom = AV28SearchTxt ;
      AV17TFForColNom_Sel = "" ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV46FilterFullText ,
                                           AV11TFCliNom_Sel ,
                                           AV10TFCliNom ,
                                           AV13TFForSer_Sel ,
                                           AV12TFForSer ,
                                           AV15TFForSerDsc_Sel ,
                                           AV14TFForSerDsc ,
                                           AV17TFForColNom_Sel ,
                                           AV16TFForColNom ,
                                           Integer.valueOf(AV18TFForColNum) ,
                                           Integer.valueOf(AV19TFForColNum_To) ,
                                           Byte.valueOf(AV20TFTipColCod) ,
                                           Byte.valueOf(AV21TFTipColCod_To) ,
                                           AV23TFForNomCli_Sel ,
                                           AV22TFForNomCli ,
                                           Integer.valueOf(AV24TFForNumCli) ,
                                           Integer.valueOf(AV25TFForNumCli_To) ,
                                           AV26TFForFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A1191ForNomCli ,
                                           Integer.valueOf(A1192ForNumCli) ,
                                           A485ForFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN
                                           }
      });
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV10TFCliNom = GXutil.padr( GXutil.rtrim( AV10TFCliNom), 30, "%") ;
      lV12TFForSer = GXutil.padr( GXutil.rtrim( AV12TFForSer), 16, "%") ;
      lV14TFForSerDsc = GXutil.padr( GXutil.rtrim( AV14TFForSerDsc), 26, "%") ;
      lV16TFForColNom = GXutil.padr( GXutil.rtrim( AV16TFForColNom), 13, "%") ;
      lV22TFForNomCli = GXutil.padr( GXutil.rtrim( AV22TFForNomCli), 13, "%") ;
      /* Using cursor P09EJ5 */
      pr_default.execute(3, new Object[] {lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV10TFCliNom, AV11TFCliNom_Sel, lV12TFForSer, AV13TFForSer_Sel, lV14TFForSerDsc, AV15TFForSerDsc_Sel, lV16TFForColNom, AV17TFForColNom_Sel, Integer.valueOf(AV18TFForColNum), Integer.valueOf(AV19TFForColNum_To), Byte.valueOf(AV20TFTipColCod), Byte.valueOf(AV21TFTipColCod_To), lV22TFForNomCli, AV23TFForNomCli_Sel, Integer.valueOf(AV24TFForNumCli), Integer.valueOf(AV25TFForNumCli_To), AV26TFForFec});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9EJ8 = false ;
         A396EmprCod = P09EJ5_A396EmprCod[0] ;
         A482ForColNom = P09EJ5_A482ForColNom[0] ;
         A485ForFec = P09EJ5_A485ForFec[0] ;
         n485ForFec = P09EJ5_n485ForFec[0] ;
         A1192ForNumCli = P09EJ5_A1192ForNumCli[0] ;
         n1192ForNumCli = P09EJ5_n1192ForNumCli[0] ;
         A1191ForNomCli = P09EJ5_A1191ForNomCli[0] ;
         n1191ForNomCli = P09EJ5_n1191ForNomCli[0] ;
         A831TipColCod = P09EJ5_A831TipColCod[0] ;
         A483ForColNum = P09EJ5_A483ForColNum[0] ;
         A5742ForSerDsc = P09EJ5_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09EJ5_n5742ForSerDsc[0] ;
         A494ForSer = P09EJ5_A494ForSer[0] ;
         A279CliNom = P09EJ5_A279CliNom[0] ;
         A252CliCod = P09EJ5_A252CliCod[0] ;
         A279CliNom = P09EJ5_A279CliNom[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09EJ5_A482ForColNom[0], A482ForColNom) == 0 ) )
         {
            brk9EJ8 = false ;
            A396EmprCod = P09EJ5_A396EmprCod[0] ;
            A831TipColCod = P09EJ5_A831TipColCod[0] ;
            A483ForColNum = P09EJ5_A483ForColNum[0] ;
            A494ForSer = P09EJ5_A494ForSer[0] ;
            A252CliCod = P09EJ5_A252CliCod[0] ;
            AV40count = (long)(AV40count+1) ;
            brk9EJ8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A482ForColNom)==0) )
         {
            AV32Option = A482ForColNom ;
            AV33Options.add(AV32Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9EJ8 )
         {
            brk9EJ8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADFORNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV22TFForNomCli = AV28SearchTxt ;
      AV23TFForNomCli_Sel = "" ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV46FilterFullText ,
                                           AV11TFCliNom_Sel ,
                                           AV10TFCliNom ,
                                           AV13TFForSer_Sel ,
                                           AV12TFForSer ,
                                           AV15TFForSerDsc_Sel ,
                                           AV14TFForSerDsc ,
                                           AV17TFForColNom_Sel ,
                                           AV16TFForColNom ,
                                           Integer.valueOf(AV18TFForColNum) ,
                                           Integer.valueOf(AV19TFForColNum_To) ,
                                           Byte.valueOf(AV20TFTipColCod) ,
                                           Byte.valueOf(AV21TFTipColCod_To) ,
                                           AV23TFForNomCli_Sel ,
                                           AV22TFForNomCli ,
                                           Integer.valueOf(AV24TFForNumCli) ,
                                           Integer.valueOf(AV25TFForNumCli_To) ,
                                           AV26TFForFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A1191ForNomCli ,
                                           Integer.valueOf(A1192ForNumCli) ,
                                           A485ForFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN
                                           }
      });
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV46FilterFullText = GXutil.concat( GXutil.rtrim( AV46FilterFullText), "%", "") ;
      lV10TFCliNom = GXutil.padr( GXutil.rtrim( AV10TFCliNom), 30, "%") ;
      lV12TFForSer = GXutil.padr( GXutil.rtrim( AV12TFForSer), 16, "%") ;
      lV14TFForSerDsc = GXutil.padr( GXutil.rtrim( AV14TFForSerDsc), 26, "%") ;
      lV16TFForColNom = GXutil.padr( GXutil.rtrim( AV16TFForColNom), 13, "%") ;
      lV22TFForNomCli = GXutil.padr( GXutil.rtrim( AV22TFForNomCli), 13, "%") ;
      /* Using cursor P09EJ6 */
      pr_default.execute(4, new Object[] {lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV46FilterFullText, lV10TFCliNom, AV11TFCliNom_Sel, lV12TFForSer, AV13TFForSer_Sel, lV14TFForSerDsc, AV15TFForSerDsc_Sel, lV16TFForColNom, AV17TFForColNom_Sel, Integer.valueOf(AV18TFForColNum), Integer.valueOf(AV19TFForColNum_To), Byte.valueOf(AV20TFTipColCod), Byte.valueOf(AV21TFTipColCod_To), lV22TFForNomCli, AV23TFForNomCli_Sel, Integer.valueOf(AV24TFForNumCli), Integer.valueOf(AV25TFForNumCli_To), AV26TFForFec});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9EJ10 = false ;
         A396EmprCod = P09EJ6_A396EmprCod[0] ;
         A1191ForNomCli = P09EJ6_A1191ForNomCli[0] ;
         n1191ForNomCli = P09EJ6_n1191ForNomCli[0] ;
         A485ForFec = P09EJ6_A485ForFec[0] ;
         n485ForFec = P09EJ6_n485ForFec[0] ;
         A1192ForNumCli = P09EJ6_A1192ForNumCli[0] ;
         n1192ForNumCli = P09EJ6_n1192ForNumCli[0] ;
         A831TipColCod = P09EJ6_A831TipColCod[0] ;
         A483ForColNum = P09EJ6_A483ForColNum[0] ;
         A482ForColNom = P09EJ6_A482ForColNom[0] ;
         A5742ForSerDsc = P09EJ6_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09EJ6_n5742ForSerDsc[0] ;
         A494ForSer = P09EJ6_A494ForSer[0] ;
         A279CliNom = P09EJ6_A279CliNom[0] ;
         A252CliCod = P09EJ6_A252CliCod[0] ;
         A279CliNom = P09EJ6_A279CliNom[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09EJ6_A1191ForNomCli[0], A1191ForNomCli) == 0 ) )
         {
            brk9EJ10 = false ;
            A396EmprCod = P09EJ6_A396EmprCod[0] ;
            A831TipColCod = P09EJ6_A831TipColCod[0] ;
            A483ForColNum = P09EJ6_A483ForColNum[0] ;
            A482ForColNom = P09EJ6_A482ForColNom[0] ;
            A494ForSer = P09EJ6_A494ForSer[0] ;
            A252CliCod = P09EJ6_A252CliCod[0] ;
            AV40count = (long)(AV40count+1) ;
            brk9EJ10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A1191ForNomCli)==0) )
         {
            AV32Option = A1191ForNomCli ;
            AV33Options.add(AV32Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9EJ10 )
         {
            brk9EJ10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = mtoformulastintepromptgetfilterdata.this.AV34OptionsJson;
      this.aP4[0] = mtoformulastintepromptgetfilterdata.this.AV37OptionsDescJson;
      this.aP5[0] = mtoformulastintepromptgetfilterdata.this.AV39OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV34OptionsJson = "" ;
      AV37OptionsDescJson = "" ;
      AV39OptionIndexesJson = "" ;
      AV33Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV36OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV41Session = httpContext.getWebSession();
      AV43GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV44GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV46FilterFullText = "" ;
      AV10TFCliNom = "" ;
      AV11TFCliNom_Sel = "" ;
      AV12TFForSer = "" ;
      AV13TFForSer_Sel = "" ;
      AV14TFForSerDsc = "" ;
      AV15TFForSerDsc_Sel = "" ;
      AV16TFForColNom = "" ;
      AV17TFForColNom_Sel = "" ;
      AV22TFForNomCli = "" ;
      AV23TFForNomCli_Sel = "" ;
      AV26TFForFec = GXutil.nullDate() ;
      AV47EmprCod = "" ;
      scmdbuf = "" ;
      lV46FilterFullText = "" ;
      lV10TFCliNom = "" ;
      lV12TFForSer = "" ;
      lV14TFForSerDsc = "" ;
      lV16TFForColNom = "" ;
      lV22TFForNomCli = "" ;
      A279CliNom = "" ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A482ForColNom = "" ;
      A1191ForNomCli = "" ;
      A485ForFec = GXutil.nullDate() ;
      P09EJ2_A396EmprCod = new String[] {""} ;
      P09EJ2_A279CliNom = new String[] {""} ;
      P09EJ2_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09EJ2_n485ForFec = new boolean[] {false} ;
      P09EJ2_A1192ForNumCli = new int[1] ;
      P09EJ2_n1192ForNumCli = new boolean[] {false} ;
      P09EJ2_A1191ForNomCli = new String[] {""} ;
      P09EJ2_n1191ForNomCli = new boolean[] {false} ;
      P09EJ2_A831TipColCod = new byte[1] ;
      P09EJ2_A483ForColNum = new int[1] ;
      P09EJ2_A482ForColNom = new String[] {""} ;
      P09EJ2_A5742ForSerDsc = new String[] {""} ;
      P09EJ2_n5742ForSerDsc = new boolean[] {false} ;
      P09EJ2_A494ForSer = new String[] {""} ;
      P09EJ2_A252CliCod = new int[1] ;
      A396EmprCod = "" ;
      AV32Option = "" ;
      P09EJ3_A396EmprCod = new String[] {""} ;
      P09EJ3_A494ForSer = new String[] {""} ;
      P09EJ3_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09EJ3_n485ForFec = new boolean[] {false} ;
      P09EJ3_A1192ForNumCli = new int[1] ;
      P09EJ3_n1192ForNumCli = new boolean[] {false} ;
      P09EJ3_A1191ForNomCli = new String[] {""} ;
      P09EJ3_n1191ForNomCli = new boolean[] {false} ;
      P09EJ3_A831TipColCod = new byte[1] ;
      P09EJ3_A483ForColNum = new int[1] ;
      P09EJ3_A482ForColNom = new String[] {""} ;
      P09EJ3_A5742ForSerDsc = new String[] {""} ;
      P09EJ3_n5742ForSerDsc = new boolean[] {false} ;
      P09EJ3_A279CliNom = new String[] {""} ;
      P09EJ3_A252CliCod = new int[1] ;
      P09EJ4_A396EmprCod = new String[] {""} ;
      P09EJ4_A5742ForSerDsc = new String[] {""} ;
      P09EJ4_n5742ForSerDsc = new boolean[] {false} ;
      P09EJ4_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09EJ4_n485ForFec = new boolean[] {false} ;
      P09EJ4_A1192ForNumCli = new int[1] ;
      P09EJ4_n1192ForNumCli = new boolean[] {false} ;
      P09EJ4_A1191ForNomCli = new String[] {""} ;
      P09EJ4_n1191ForNomCli = new boolean[] {false} ;
      P09EJ4_A831TipColCod = new byte[1] ;
      P09EJ4_A483ForColNum = new int[1] ;
      P09EJ4_A482ForColNom = new String[] {""} ;
      P09EJ4_A494ForSer = new String[] {""} ;
      P09EJ4_A279CliNom = new String[] {""} ;
      P09EJ4_A252CliCod = new int[1] ;
      P09EJ5_A396EmprCod = new String[] {""} ;
      P09EJ5_A482ForColNom = new String[] {""} ;
      P09EJ5_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09EJ5_n485ForFec = new boolean[] {false} ;
      P09EJ5_A1192ForNumCli = new int[1] ;
      P09EJ5_n1192ForNumCli = new boolean[] {false} ;
      P09EJ5_A1191ForNomCli = new String[] {""} ;
      P09EJ5_n1191ForNomCli = new boolean[] {false} ;
      P09EJ5_A831TipColCod = new byte[1] ;
      P09EJ5_A483ForColNum = new int[1] ;
      P09EJ5_A5742ForSerDsc = new String[] {""} ;
      P09EJ5_n5742ForSerDsc = new boolean[] {false} ;
      P09EJ5_A494ForSer = new String[] {""} ;
      P09EJ5_A279CliNom = new String[] {""} ;
      P09EJ5_A252CliCod = new int[1] ;
      P09EJ6_A396EmprCod = new String[] {""} ;
      P09EJ6_A1191ForNomCli = new String[] {""} ;
      P09EJ6_n1191ForNomCli = new boolean[] {false} ;
      P09EJ6_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09EJ6_n485ForFec = new boolean[] {false} ;
      P09EJ6_A1192ForNumCli = new int[1] ;
      P09EJ6_n1192ForNumCli = new boolean[] {false} ;
      P09EJ6_A831TipColCod = new byte[1] ;
      P09EJ6_A483ForColNum = new int[1] ;
      P09EJ6_A482ForColNom = new String[] {""} ;
      P09EJ6_A5742ForSerDsc = new String[] {""} ;
      P09EJ6_n5742ForSerDsc = new boolean[] {false} ;
      P09EJ6_A494ForSer = new String[] {""} ;
      P09EJ6_A279CliNom = new String[] {""} ;
      P09EJ6_A252CliCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.mtoformulastintepromptgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09EJ2_A396EmprCod, P09EJ2_A279CliNom, P09EJ2_A485ForFec, P09EJ2_n485ForFec, P09EJ2_A1192ForNumCli, P09EJ2_n1192ForNumCli, P09EJ2_A1191ForNomCli, P09EJ2_n1191ForNomCli, P09EJ2_A831TipColCod, P09EJ2_A483ForColNum,
            P09EJ2_A482ForColNom, P09EJ2_A5742ForSerDsc, P09EJ2_n5742ForSerDsc, P09EJ2_A494ForSer, P09EJ2_A252CliCod
            }
            , new Object[] {
            P09EJ3_A396EmprCod, P09EJ3_A494ForSer, P09EJ3_A485ForFec, P09EJ3_n485ForFec, P09EJ3_A1192ForNumCli, P09EJ3_n1192ForNumCli, P09EJ3_A1191ForNomCli, P09EJ3_n1191ForNomCli, P09EJ3_A831TipColCod, P09EJ3_A483ForColNum,
            P09EJ3_A482ForColNom, P09EJ3_A5742ForSerDsc, P09EJ3_n5742ForSerDsc, P09EJ3_A279CliNom, P09EJ3_A252CliCod
            }
            , new Object[] {
            P09EJ4_A396EmprCod, P09EJ4_A5742ForSerDsc, P09EJ4_n5742ForSerDsc, P09EJ4_A485ForFec, P09EJ4_n485ForFec, P09EJ4_A1192ForNumCli, P09EJ4_n1192ForNumCli, P09EJ4_A1191ForNomCli, P09EJ4_n1191ForNomCli, P09EJ4_A831TipColCod,
            P09EJ4_A483ForColNum, P09EJ4_A482ForColNom, P09EJ4_A494ForSer, P09EJ4_A279CliNom, P09EJ4_A252CliCod
            }
            , new Object[] {
            P09EJ5_A396EmprCod, P09EJ5_A482ForColNom, P09EJ5_A485ForFec, P09EJ5_n485ForFec, P09EJ5_A1192ForNumCli, P09EJ5_n1192ForNumCli, P09EJ5_A1191ForNomCli, P09EJ5_n1191ForNomCli, P09EJ5_A831TipColCod, P09EJ5_A483ForColNum,
            P09EJ5_A5742ForSerDsc, P09EJ5_n5742ForSerDsc, P09EJ5_A494ForSer, P09EJ5_A279CliNom, P09EJ5_A252CliCod
            }
            , new Object[] {
            P09EJ6_A396EmprCod, P09EJ6_A1191ForNomCli, P09EJ6_n1191ForNomCli, P09EJ6_A485ForFec, P09EJ6_n485ForFec, P09EJ6_A1192ForNumCli, P09EJ6_n1192ForNumCli, P09EJ6_A831TipColCod, P09EJ6_A483ForColNum, P09EJ6_A482ForColNom,
            P09EJ6_A5742ForSerDsc, P09EJ6_n5742ForSerDsc, P09EJ6_A494ForSer, P09EJ6_A279CliNom, P09EJ6_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20TFTipColCod ;
   private byte AV21TFTipColCod_To ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV58GXV1 ;
   private int AV18TFForColNum ;
   private int AV19TFForColNum_To ;
   private int AV24TFForNumCli ;
   private int AV25TFForNumCli_To ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A1192ForNumCli ;
   private long AV40count ;
   private String AV10TFCliNom ;
   private String AV11TFCliNom_Sel ;
   private String AV12TFForSer ;
   private String AV13TFForSer_Sel ;
   private String AV14TFForSerDsc ;
   private String AV15TFForSerDsc_Sel ;
   private String AV16TFForColNom ;
   private String AV17TFForColNom_Sel ;
   private String AV22TFForNomCli ;
   private String AV23TFForNomCli_Sel ;
   private String AV47EmprCod ;
   private String scmdbuf ;
   private String lV10TFCliNom ;
   private String lV12TFForSer ;
   private String lV14TFForSerDsc ;
   private String lV16TFForColNom ;
   private String lV22TFForNomCli ;
   private String A279CliNom ;
   private String A494ForSer ;
   private String A5742ForSerDsc ;
   private String A482ForColNom ;
   private String A1191ForNomCli ;
   private String A396EmprCod ;
   private java.util.Date AV26TFForFec ;
   private java.util.Date A485ForFec ;
   private boolean returnInSub ;
   private boolean brk9EJ2 ;
   private boolean n485ForFec ;
   private boolean n1192ForNumCli ;
   private boolean n1191ForNomCli ;
   private boolean n5742ForSerDsc ;
   private boolean brk9EJ4 ;
   private boolean brk9EJ6 ;
   private boolean brk9EJ8 ;
   private boolean brk9EJ10 ;
   private String AV34OptionsJson ;
   private String AV37OptionsDescJson ;
   private String AV39OptionIndexesJson ;
   private String AV30DDOName ;
   private String AV28SearchTxt ;
   private String AV29SearchTxtTo ;
   private String AV46FilterFullText ;
   private String lV46FilterFullText ;
   private String AV32Option ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09EJ2_A396EmprCod ;
   private String[] P09EJ2_A279CliNom ;
   private java.util.Date[] P09EJ2_A485ForFec ;
   private boolean[] P09EJ2_n485ForFec ;
   private int[] P09EJ2_A1192ForNumCli ;
   private boolean[] P09EJ2_n1192ForNumCli ;
   private String[] P09EJ2_A1191ForNomCli ;
   private boolean[] P09EJ2_n1191ForNomCli ;
   private byte[] P09EJ2_A831TipColCod ;
   private int[] P09EJ2_A483ForColNum ;
   private String[] P09EJ2_A482ForColNom ;
   private String[] P09EJ2_A5742ForSerDsc ;
   private boolean[] P09EJ2_n5742ForSerDsc ;
   private String[] P09EJ2_A494ForSer ;
   private int[] P09EJ2_A252CliCod ;
   private String[] P09EJ3_A396EmprCod ;
   private String[] P09EJ3_A494ForSer ;
   private java.util.Date[] P09EJ3_A485ForFec ;
   private boolean[] P09EJ3_n485ForFec ;
   private int[] P09EJ3_A1192ForNumCli ;
   private boolean[] P09EJ3_n1192ForNumCli ;
   private String[] P09EJ3_A1191ForNomCli ;
   private boolean[] P09EJ3_n1191ForNomCli ;
   private byte[] P09EJ3_A831TipColCod ;
   private int[] P09EJ3_A483ForColNum ;
   private String[] P09EJ3_A482ForColNom ;
   private String[] P09EJ3_A5742ForSerDsc ;
   private boolean[] P09EJ3_n5742ForSerDsc ;
   private String[] P09EJ3_A279CliNom ;
   private int[] P09EJ3_A252CliCod ;
   private String[] P09EJ4_A396EmprCod ;
   private String[] P09EJ4_A5742ForSerDsc ;
   private boolean[] P09EJ4_n5742ForSerDsc ;
   private java.util.Date[] P09EJ4_A485ForFec ;
   private boolean[] P09EJ4_n485ForFec ;
   private int[] P09EJ4_A1192ForNumCli ;
   private boolean[] P09EJ4_n1192ForNumCli ;
   private String[] P09EJ4_A1191ForNomCli ;
   private boolean[] P09EJ4_n1191ForNomCli ;
   private byte[] P09EJ4_A831TipColCod ;
   private int[] P09EJ4_A483ForColNum ;
   private String[] P09EJ4_A482ForColNom ;
   private String[] P09EJ4_A494ForSer ;
   private String[] P09EJ4_A279CliNom ;
   private int[] P09EJ4_A252CliCod ;
   private String[] P09EJ5_A396EmprCod ;
   private String[] P09EJ5_A482ForColNom ;
   private java.util.Date[] P09EJ5_A485ForFec ;
   private boolean[] P09EJ5_n485ForFec ;
   private int[] P09EJ5_A1192ForNumCli ;
   private boolean[] P09EJ5_n1192ForNumCli ;
   private String[] P09EJ5_A1191ForNomCli ;
   private boolean[] P09EJ5_n1191ForNomCli ;
   private byte[] P09EJ5_A831TipColCod ;
   private int[] P09EJ5_A483ForColNum ;
   private String[] P09EJ5_A5742ForSerDsc ;
   private boolean[] P09EJ5_n5742ForSerDsc ;
   private String[] P09EJ5_A494ForSer ;
   private String[] P09EJ5_A279CliNom ;
   private int[] P09EJ5_A252CliCod ;
   private String[] P09EJ6_A396EmprCod ;
   private String[] P09EJ6_A1191ForNomCli ;
   private boolean[] P09EJ6_n1191ForNomCli ;
   private java.util.Date[] P09EJ6_A485ForFec ;
   private boolean[] P09EJ6_n485ForFec ;
   private int[] P09EJ6_A1192ForNumCli ;
   private boolean[] P09EJ6_n1192ForNumCli ;
   private byte[] P09EJ6_A831TipColCod ;
   private int[] P09EJ6_A483ForColNum ;
   private String[] P09EJ6_A482ForColNom ;
   private String[] P09EJ6_A5742ForSerDsc ;
   private boolean[] P09EJ6_n5742ForSerDsc ;
   private String[] P09EJ6_A494ForSer ;
   private String[] P09EJ6_A279CliNom ;
   private int[] P09EJ6_A252CliCod ;
   private GXSimpleCollection<String> AV33Options ;
   private GXSimpleCollection<String> AV36OptionsDesc ;
   private GXSimpleCollection<String> AV38OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV43GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV44GridStateFilterValue ;
}

final  class mtoformulastintepromptgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09EJ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV46FilterFullText ,
                                          String AV11TFCliNom_Sel ,
                                          String AV10TFCliNom ,
                                          String AV13TFForSer_Sel ,
                                          String AV12TFForSer ,
                                          String AV15TFForSerDsc_Sel ,
                                          String AV14TFForSerDsc ,
                                          String AV17TFForColNom_Sel ,
                                          String AV16TFForColNom ,
                                          int AV18TFForColNum ,
                                          int AV19TFForColNum_To ,
                                          byte AV20TFTipColCod ,
                                          byte AV21TFTipColCod_To ,
                                          String AV23TFForNomCli_Sel ,
                                          String AV22TFForNomCli ,
                                          int AV24TFForNumCli ,
                                          int AV25TFForNumCli_To ,
                                          java.util.Date AV26TFForFec ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A1191ForNomCli ,
                                          int A1192ForNumCli ,
                                          java.util.Date A485ForFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[26];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.CliNom, T1.ForFec, T1.ForNumCli, T1.ForNomCli, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T1.CliCod FROM (TXPCFORMU" ;
      scmdbuf += " T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV46FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T1.ForNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForNumCli,'999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFForSer_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFForSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFForSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFForSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFForSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFForSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFForColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFForColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFForColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV18TFForColNum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV19TFForColNum_To) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV20TFTipColCod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV21TFTipColCod_To) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFForNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFForNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFForNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForNomCli = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV24TFForNumCli) )
      {
         addWhere(sWhereString, "(T1.ForNumCli >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV25TFForNumCli_To) )
      {
         addWhere(sWhereString, "(T1.ForNumCli <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV26TFForFec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09EJ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV46FilterFullText ,
                                          String AV11TFCliNom_Sel ,
                                          String AV10TFCliNom ,
                                          String AV13TFForSer_Sel ,
                                          String AV12TFForSer ,
                                          String AV15TFForSerDsc_Sel ,
                                          String AV14TFForSerDsc ,
                                          String AV17TFForColNom_Sel ,
                                          String AV16TFForColNom ,
                                          int AV18TFForColNum ,
                                          int AV19TFForColNum_To ,
                                          byte AV20TFTipColCod ,
                                          byte AV21TFTipColCod_To ,
                                          String AV23TFForNomCli_Sel ,
                                          String AV22TFForNomCli ,
                                          int AV24TFForNumCli ,
                                          int AV25TFForNumCli_To ,
                                          java.util.Date AV26TFForFec ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A1191ForNomCli ,
                                          int A1192ForNumCli ,
                                          java.util.Date A485ForFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[26];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ForSer, T1.ForFec, T1.ForNumCli, T1.ForNomCli, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T2.CliNom, T1.CliCod FROM (TXPCFORMU" ;
      scmdbuf += " T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV46FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T1.ForNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForNumCli,'999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFForSer_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFForSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFForSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFForSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFForSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFForSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFForColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFForColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFForColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (0==AV18TFForColNum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (0==AV19TFForColNum_To) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (0==AV20TFTipColCod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (0==AV21TFTipColCod_To) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFForNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFForNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFForNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForNomCli = ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV24TFForNumCli) )
      {
         addWhere(sWhereString, "(T1.ForNumCli >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV25TFForNumCli_To) )
      {
         addWhere(sWhereString, "(T1.ForNumCli <= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV26TFForFec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForSer" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09EJ4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV46FilterFullText ,
                                          String AV11TFCliNom_Sel ,
                                          String AV10TFCliNom ,
                                          String AV13TFForSer_Sel ,
                                          String AV12TFForSer ,
                                          String AV15TFForSerDsc_Sel ,
                                          String AV14TFForSerDsc ,
                                          String AV17TFForColNom_Sel ,
                                          String AV16TFForColNom ,
                                          int AV18TFForColNum ,
                                          int AV19TFForColNum_To ,
                                          byte AV20TFTipColCod ,
                                          byte AV21TFTipColCod_To ,
                                          String AV23TFForNomCli_Sel ,
                                          String AV22TFForNomCli ,
                                          int AV24TFForNumCli ,
                                          int AV25TFForNumCli_To ,
                                          java.util.Date AV26TFForFec ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A1191ForNomCli ,
                                          int A1192ForNumCli ,
                                          java.util.Date A485ForFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[26];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ForSerDsc, T1.ForFec, T1.ForNumCli, T1.ForNomCli, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T2.CliNom, T1.CliCod FROM (TXPCFORMU" ;
      scmdbuf += " T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV46FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T1.ForNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForNumCli,'999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFForSer_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFForSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFForSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFForSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFForSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFForSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFForColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFForColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFForColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV18TFForColNum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV19TFForColNum_To) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV20TFTipColCod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV21TFTipColCod_To) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFForNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFForNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFForNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForNomCli = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV24TFForNumCli) )
      {
         addWhere(sWhereString, "(T1.ForNumCli >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV25TFForNumCli_To) )
      {
         addWhere(sWhereString, "(T1.ForNumCli <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV26TFForFec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForSerDsc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09EJ5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV46FilterFullText ,
                                          String AV11TFCliNom_Sel ,
                                          String AV10TFCliNom ,
                                          String AV13TFForSer_Sel ,
                                          String AV12TFForSer ,
                                          String AV15TFForSerDsc_Sel ,
                                          String AV14TFForSerDsc ,
                                          String AV17TFForColNom_Sel ,
                                          String AV16TFForColNom ,
                                          int AV18TFForColNum ,
                                          int AV19TFForColNum_To ,
                                          byte AV20TFTipColCod ,
                                          byte AV21TFTipColCod_To ,
                                          String AV23TFForNomCli_Sel ,
                                          String AV22TFForNomCli ,
                                          int AV24TFForNumCli ,
                                          int AV25TFForNumCli_To ,
                                          java.util.Date AV26TFForFec ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A1191ForNomCli ,
                                          int A1192ForNumCli ,
                                          java.util.Date A485ForFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[26];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ForColNom, T1.ForFec, T1.ForNumCli, T1.ForNomCli, T1.TipColCod, T1.ForColNum, T1.ForSerDsc, T1.ForSer, T2.CliNom, T1.CliCod FROM (TXPCFORMU" ;
      scmdbuf += " T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV46FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T1.ForNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForNumCli,'999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFForSer_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFForSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFForSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFForSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFForSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFForSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFForColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFForColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFForColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV18TFForColNum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV19TFForColNum_To) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV20TFTipColCod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV21TFTipColCod_To) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFForNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFForNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFForNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForNomCli = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV24TFForNumCli) )
      {
         addWhere(sWhereString, "(T1.ForNumCli >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV25TFForNumCli_To) )
      {
         addWhere(sWhereString, "(T1.ForNumCli <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV26TFForFec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForColNom" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09EJ6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV46FilterFullText ,
                                          String AV11TFCliNom_Sel ,
                                          String AV10TFCliNom ,
                                          String AV13TFForSer_Sel ,
                                          String AV12TFForSer ,
                                          String AV15TFForSerDsc_Sel ,
                                          String AV14TFForSerDsc ,
                                          String AV17TFForColNom_Sel ,
                                          String AV16TFForColNom ,
                                          int AV18TFForColNum ,
                                          int AV19TFForColNum_To ,
                                          byte AV20TFTipColCod ,
                                          byte AV21TFTipColCod_To ,
                                          String AV23TFForNomCli_Sel ,
                                          String AV22TFForNomCli ,
                                          int AV24TFForNumCli ,
                                          int AV25TFForNumCli_To ,
                                          java.util.Date AV26TFForFec ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A1191ForNomCli ,
                                          int A1192ForNumCli ,
                                          java.util.Date A485ForFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[26];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ForNomCli, T1.ForFec, T1.ForNumCli, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T2.CliNom, T1.CliCod FROM (TXPCFORMU" ;
      scmdbuf += " T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV46FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T1.ForNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForNumCli,'999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int10[0] = (byte)(1) ;
         GXv_int10[1] = (byte)(1) ;
         GXv_int10[2] = (byte)(1) ;
         GXv_int10[3] = (byte)(1) ;
         GXv_int10[4] = (byte)(1) ;
         GXv_int10[5] = (byte)(1) ;
         GXv_int10[6] = (byte)(1) ;
         GXv_int10[7] = (byte)(1) ;
         GXv_int10[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFForSer_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFForSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFForSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFForSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFForSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFForSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFForColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFForColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFForColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (0==AV18TFForColNum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (0==AV19TFForColNum_To) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (0==AV20TFTipColCod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (0==AV21TFTipColCod_To) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFForNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFForNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFForNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForNomCli = ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (0==AV24TFForNumCli) )
      {
         addWhere(sWhereString, "(T1.ForNumCli >= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (0==AV25TFForNumCli_To) )
      {
         addWhere(sWhereString, "(T1.ForNumCli <= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV26TFForFec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForNomCli" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
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
                  return conditional_P09EJ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (java.util.Date)dynConstraints[27] );
            case 1 :
                  return conditional_P09EJ3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (java.util.Date)dynConstraints[27] );
            case 2 :
                  return conditional_P09EJ4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (java.util.Date)dynConstraints[27] );
            case 3 :
                  return conditional_P09EJ5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (java.util.Date)dynConstraints[27] );
            case 4 :
                  return conditional_P09EJ6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (java.util.Date)dynConstraints[27] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09EJ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09EJ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09EJ4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09EJ5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09EJ6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 13);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 13);
               ((String[]) buf[11])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 16);
               ((int[]) buf[14])[0] = rslt.getInt(11);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 13);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 13);
               ((String[]) buf[11])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 30);
               ((int[]) buf[14])[0] = rslt.getInt(11);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 13);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((String[]) buf[11])[0] = rslt.getString(8, 13);
               ((String[]) buf[12])[0] = rslt.getString(9, 16);
               ((String[]) buf[13])[0] = rslt.getString(10, 30);
               ((int[]) buf[14])[0] = rslt.getInt(11);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 13);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 16);
               ((String[]) buf[13])[0] = rslt.getString(10, 30);
               ((int[]) buf[14])[0] = rslt.getInt(11);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 13);
               ((String[]) buf[10])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 16);
               ((String[]) buf[13])[0] = rslt.getString(10, 30);
               ((int[]) buf[14])[0] = rslt.getInt(11);
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
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               return;
      }
   }

}

