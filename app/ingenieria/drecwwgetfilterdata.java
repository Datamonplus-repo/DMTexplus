package app.ingenieria ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class drecwwgetfilterdata extends GXProcedure
{
   public drecwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( drecwwgetfilterdata.class ), "" );
   }

   public drecwwgetfilterdata( int remoteHandle ,
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
      drecwwgetfilterdata.this.aP5 = new String[] {""};
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
      drecwwgetfilterdata.this.AV32DDOName = aP0;
      drecwwgetfilterdata.this.AV33SearchTxt = aP1;
      drecwwgetfilterdata.this.AV34SearchTxtTo = aP2;
      drecwwgetfilterdata.this.aP3 = aP3;
      drecwwgetfilterdata.this.aP4 = aP4;
      drecwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_DRECMAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADDRECMAQCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_DRECPLC") == 0 )
      {
         /* Execute user subroutine: 'LOADDRECPLCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_DRECVAL") == 0 )
      {
         /* Execute user subroutine: 'LOADDRECVALOPTIONS' */
         S141 ();
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
      if ( GXutil.strcmp(AV27Session.getValue("Ingenieria.DRecWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Ingenieria.DRecWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("Ingenieria.DRecWWGridState"), null, null);
      }
      AV41GXV1 = 1 ;
      while ( AV41GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV41GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV38FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDRECID") == 0 )
         {
            AV10TFDRecId = GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV11TFDRecId_To = GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDRECMAQCOD") == 0 )
         {
            AV12TFDRecMaqCod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDRECMAQCOD_SEL") == 0 )
         {
            AV13TFDRecMaqCod_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDRECPLC") == 0 )
         {
            AV14TFDRecPLC = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDRECPLC_SEL") == 0 )
         {
            AV15TFDRecPLC_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDRECVAL") == 0 )
         {
            AV16TFDRecVal = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDRECVAL_SEL") == 0 )
         {
            AV17TFDRecVal_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDRECFEC") == 0 )
         {
            AV18TFDRecFec = localUtil.ctot( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV41GXV1 = (int)(AV41GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADDRECMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFDRecMaqCod = AV33SearchTxt ;
      AV13TFDRecMaqCod_Sel = "" ;
      AV43Ingenieria_drecwwds_1_filterfulltext = AV38FilterFullText ;
      AV44Ingenieria_drecwwds_2_tfdrecid = AV10TFDRecId ;
      AV45Ingenieria_drecwwds_3_tfdrecid_to = AV11TFDRecId_To ;
      AV46Ingenieria_drecwwds_4_tfdrecmaqcod = AV12TFDRecMaqCod ;
      AV47Ingenieria_drecwwds_5_tfdrecmaqcod_sel = AV13TFDRecMaqCod_Sel ;
      AV48Ingenieria_drecwwds_6_tfdrecplc = AV14TFDRecPLC ;
      AV49Ingenieria_drecwwds_7_tfdrecplc_sel = AV15TFDRecPLC_Sel ;
      AV50Ingenieria_drecwwds_8_tfdrecval = AV16TFDRecVal ;
      AV51Ingenieria_drecwwds_9_tfdrecval_sel = AV17TFDRecVal_Sel ;
      AV52Ingenieria_drecwwds_10_tfdrecfec = AV18TFDRecFec ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV43Ingenieria_drecwwds_1_filterfulltext ,
                                           Long.valueOf(AV44Ingenieria_drecwwds_2_tfdrecid) ,
                                           Long.valueOf(AV45Ingenieria_drecwwds_3_tfdrecid_to) ,
                                           AV47Ingenieria_drecwwds_5_tfdrecmaqcod_sel ,
                                           AV46Ingenieria_drecwwds_4_tfdrecmaqcod ,
                                           AV49Ingenieria_drecwwds_7_tfdrecplc_sel ,
                                           AV48Ingenieria_drecwwds_6_tfdrecplc ,
                                           AV51Ingenieria_drecwwds_9_tfdrecval_sel ,
                                           AV50Ingenieria_drecwwds_8_tfdrecval ,
                                           AV52Ingenieria_drecwwds_10_tfdrecfec ,
                                           Long.valueOf(A14675DRecId) ,
                                           A14705DRecMaqCod ,
                                           A14706DRecPLC ,
                                           A14707DRecVal ,
                                           A14676DRecFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      lV43Ingenieria_drecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Ingenieria_drecwwds_1_filterfulltext), "%", "") ;
      lV43Ingenieria_drecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Ingenieria_drecwwds_1_filterfulltext), "%", "") ;
      lV43Ingenieria_drecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Ingenieria_drecwwds_1_filterfulltext), "%", "") ;
      lV43Ingenieria_drecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Ingenieria_drecwwds_1_filterfulltext), "%", "") ;
      lV46Ingenieria_drecwwds_4_tfdrecmaqcod = GXutil.padr( GXutil.rtrim( AV46Ingenieria_drecwwds_4_tfdrecmaqcod), 6, "%") ;
      lV48Ingenieria_drecwwds_6_tfdrecplc = GXutil.concat( GXutil.rtrim( AV48Ingenieria_drecwwds_6_tfdrecplc), "%", "") ;
      lV50Ingenieria_drecwwds_8_tfdrecval = GXutil.padr( GXutil.rtrim( AV50Ingenieria_drecwwds_8_tfdrecval), 12, "%") ;
      /* Using cursor P0AUQ2 */
      pr_default.execute(0, new Object[] {lV43Ingenieria_drecwwds_1_filterfulltext, lV43Ingenieria_drecwwds_1_filterfulltext, lV43Ingenieria_drecwwds_1_filterfulltext, lV43Ingenieria_drecwwds_1_filterfulltext, Long.valueOf(AV44Ingenieria_drecwwds_2_tfdrecid), Long.valueOf(AV45Ingenieria_drecwwds_3_tfdrecid_to), lV46Ingenieria_drecwwds_4_tfdrecmaqcod, AV47Ingenieria_drecwwds_5_tfdrecmaqcod_sel, lV48Ingenieria_drecwwds_6_tfdrecplc, AV49Ingenieria_drecwwds_7_tfdrecplc_sel, lV50Ingenieria_drecwwds_8_tfdrecval, AV51Ingenieria_drecwwds_9_tfdrecval_sel, AV52Ingenieria_drecwwds_10_tfdrecfec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAUQ2 = false ;
         A14705DRecMaqCod = P0AUQ2_A14705DRecMaqCod[0] ;
         A14676DRecFec = P0AUQ2_A14676DRecFec[0] ;
         A14707DRecVal = P0AUQ2_A14707DRecVal[0] ;
         A14706DRecPLC = P0AUQ2_A14706DRecPLC[0] ;
         A14675DRecId = P0AUQ2_A14675DRecId[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AUQ2_A14705DRecMaqCod[0], A14705DRecMaqCod) == 0 ) )
         {
            brkAUQ2 = false ;
            A14675DRecId = P0AUQ2_A14675DRecId[0] ;
            AV26count = (long)(AV26count+1) ;
            brkAUQ2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A14705DRecMaqCod)==0) )
         {
            AV21Option = A14705DRecMaqCod ;
            AV22Options.add(AV21Option, 0);
            AV25OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV22Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAUQ2 )
         {
            brkAUQ2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADDRECPLCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFDRecPLC = AV33SearchTxt ;
      AV15TFDRecPLC_Sel = "" ;
      AV43Ingenieria_drecwwds_1_filterfulltext = AV38FilterFullText ;
      AV44Ingenieria_drecwwds_2_tfdrecid = AV10TFDRecId ;
      AV45Ingenieria_drecwwds_3_tfdrecid_to = AV11TFDRecId_To ;
      AV46Ingenieria_drecwwds_4_tfdrecmaqcod = AV12TFDRecMaqCod ;
      AV47Ingenieria_drecwwds_5_tfdrecmaqcod_sel = AV13TFDRecMaqCod_Sel ;
      AV48Ingenieria_drecwwds_6_tfdrecplc = AV14TFDRecPLC ;
      AV49Ingenieria_drecwwds_7_tfdrecplc_sel = AV15TFDRecPLC_Sel ;
      AV50Ingenieria_drecwwds_8_tfdrecval = AV16TFDRecVal ;
      AV51Ingenieria_drecwwds_9_tfdrecval_sel = AV17TFDRecVal_Sel ;
      AV52Ingenieria_drecwwds_10_tfdrecfec = AV18TFDRecFec ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV43Ingenieria_drecwwds_1_filterfulltext ,
                                           Long.valueOf(AV44Ingenieria_drecwwds_2_tfdrecid) ,
                                           Long.valueOf(AV45Ingenieria_drecwwds_3_tfdrecid_to) ,
                                           AV47Ingenieria_drecwwds_5_tfdrecmaqcod_sel ,
                                           AV46Ingenieria_drecwwds_4_tfdrecmaqcod ,
                                           AV49Ingenieria_drecwwds_7_tfdrecplc_sel ,
                                           AV48Ingenieria_drecwwds_6_tfdrecplc ,
                                           AV51Ingenieria_drecwwds_9_tfdrecval_sel ,
                                           AV50Ingenieria_drecwwds_8_tfdrecval ,
                                           AV52Ingenieria_drecwwds_10_tfdrecfec ,
                                           Long.valueOf(A14675DRecId) ,
                                           A14705DRecMaqCod ,
                                           A14706DRecPLC ,
                                           A14707DRecVal ,
                                           A14676DRecFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      lV43Ingenieria_drecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Ingenieria_drecwwds_1_filterfulltext), "%", "") ;
      lV43Ingenieria_drecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Ingenieria_drecwwds_1_filterfulltext), "%", "") ;
      lV43Ingenieria_drecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Ingenieria_drecwwds_1_filterfulltext), "%", "") ;
      lV43Ingenieria_drecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Ingenieria_drecwwds_1_filterfulltext), "%", "") ;
      lV46Ingenieria_drecwwds_4_tfdrecmaqcod = GXutil.padr( GXutil.rtrim( AV46Ingenieria_drecwwds_4_tfdrecmaqcod), 6, "%") ;
      lV48Ingenieria_drecwwds_6_tfdrecplc = GXutil.concat( GXutil.rtrim( AV48Ingenieria_drecwwds_6_tfdrecplc), "%", "") ;
      lV50Ingenieria_drecwwds_8_tfdrecval = GXutil.padr( GXutil.rtrim( AV50Ingenieria_drecwwds_8_tfdrecval), 12, "%") ;
      /* Using cursor P0AUQ3 */
      pr_default.execute(1, new Object[] {lV43Ingenieria_drecwwds_1_filterfulltext, lV43Ingenieria_drecwwds_1_filterfulltext, lV43Ingenieria_drecwwds_1_filterfulltext, lV43Ingenieria_drecwwds_1_filterfulltext, Long.valueOf(AV44Ingenieria_drecwwds_2_tfdrecid), Long.valueOf(AV45Ingenieria_drecwwds_3_tfdrecid_to), lV46Ingenieria_drecwwds_4_tfdrecmaqcod, AV47Ingenieria_drecwwds_5_tfdrecmaqcod_sel, lV48Ingenieria_drecwwds_6_tfdrecplc, AV49Ingenieria_drecwwds_7_tfdrecplc_sel, lV50Ingenieria_drecwwds_8_tfdrecval, AV51Ingenieria_drecwwds_9_tfdrecval_sel, AV52Ingenieria_drecwwds_10_tfdrecfec});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAUQ4 = false ;
         A14706DRecPLC = P0AUQ3_A14706DRecPLC[0] ;
         A14676DRecFec = P0AUQ3_A14676DRecFec[0] ;
         A14707DRecVal = P0AUQ3_A14707DRecVal[0] ;
         A14705DRecMaqCod = P0AUQ3_A14705DRecMaqCod[0] ;
         A14675DRecId = P0AUQ3_A14675DRecId[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AUQ3_A14706DRecPLC[0], A14706DRecPLC) == 0 ) )
         {
            brkAUQ4 = false ;
            A14675DRecId = P0AUQ3_A14675DRecId[0] ;
            AV26count = (long)(AV26count+1) ;
            brkAUQ4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A14706DRecPLC)==0) )
         {
            AV21Option = A14706DRecPLC ;
            AV22Options.add(AV21Option, 0);
            AV25OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV22Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAUQ4 )
         {
            brkAUQ4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADDRECVALOPTIONS' Routine */
      returnInSub = false ;
      AV16TFDRecVal = AV33SearchTxt ;
      AV17TFDRecVal_Sel = "" ;
      AV43Ingenieria_drecwwds_1_filterfulltext = AV38FilterFullText ;
      AV44Ingenieria_drecwwds_2_tfdrecid = AV10TFDRecId ;
      AV45Ingenieria_drecwwds_3_tfdrecid_to = AV11TFDRecId_To ;
      AV46Ingenieria_drecwwds_4_tfdrecmaqcod = AV12TFDRecMaqCod ;
      AV47Ingenieria_drecwwds_5_tfdrecmaqcod_sel = AV13TFDRecMaqCod_Sel ;
      AV48Ingenieria_drecwwds_6_tfdrecplc = AV14TFDRecPLC ;
      AV49Ingenieria_drecwwds_7_tfdrecplc_sel = AV15TFDRecPLC_Sel ;
      AV50Ingenieria_drecwwds_8_tfdrecval = AV16TFDRecVal ;
      AV51Ingenieria_drecwwds_9_tfdrecval_sel = AV17TFDRecVal_Sel ;
      AV52Ingenieria_drecwwds_10_tfdrecfec = AV18TFDRecFec ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV43Ingenieria_drecwwds_1_filterfulltext ,
                                           Long.valueOf(AV44Ingenieria_drecwwds_2_tfdrecid) ,
                                           Long.valueOf(AV45Ingenieria_drecwwds_3_tfdrecid_to) ,
                                           AV47Ingenieria_drecwwds_5_tfdrecmaqcod_sel ,
                                           AV46Ingenieria_drecwwds_4_tfdrecmaqcod ,
                                           AV49Ingenieria_drecwwds_7_tfdrecplc_sel ,
                                           AV48Ingenieria_drecwwds_6_tfdrecplc ,
                                           AV51Ingenieria_drecwwds_9_tfdrecval_sel ,
                                           AV50Ingenieria_drecwwds_8_tfdrecval ,
                                           AV52Ingenieria_drecwwds_10_tfdrecfec ,
                                           Long.valueOf(A14675DRecId) ,
                                           A14705DRecMaqCod ,
                                           A14706DRecPLC ,
                                           A14707DRecVal ,
                                           A14676DRecFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      lV43Ingenieria_drecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Ingenieria_drecwwds_1_filterfulltext), "%", "") ;
      lV43Ingenieria_drecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Ingenieria_drecwwds_1_filterfulltext), "%", "") ;
      lV43Ingenieria_drecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Ingenieria_drecwwds_1_filterfulltext), "%", "") ;
      lV43Ingenieria_drecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Ingenieria_drecwwds_1_filterfulltext), "%", "") ;
      lV46Ingenieria_drecwwds_4_tfdrecmaqcod = GXutil.padr( GXutil.rtrim( AV46Ingenieria_drecwwds_4_tfdrecmaqcod), 6, "%") ;
      lV48Ingenieria_drecwwds_6_tfdrecplc = GXutil.concat( GXutil.rtrim( AV48Ingenieria_drecwwds_6_tfdrecplc), "%", "") ;
      lV50Ingenieria_drecwwds_8_tfdrecval = GXutil.padr( GXutil.rtrim( AV50Ingenieria_drecwwds_8_tfdrecval), 12, "%") ;
      /* Using cursor P0AUQ4 */
      pr_default.execute(2, new Object[] {lV43Ingenieria_drecwwds_1_filterfulltext, lV43Ingenieria_drecwwds_1_filterfulltext, lV43Ingenieria_drecwwds_1_filterfulltext, lV43Ingenieria_drecwwds_1_filterfulltext, Long.valueOf(AV44Ingenieria_drecwwds_2_tfdrecid), Long.valueOf(AV45Ingenieria_drecwwds_3_tfdrecid_to), lV46Ingenieria_drecwwds_4_tfdrecmaqcod, AV47Ingenieria_drecwwds_5_tfdrecmaqcod_sel, lV48Ingenieria_drecwwds_6_tfdrecplc, AV49Ingenieria_drecwwds_7_tfdrecplc_sel, lV50Ingenieria_drecwwds_8_tfdrecval, AV51Ingenieria_drecwwds_9_tfdrecval_sel, AV52Ingenieria_drecwwds_10_tfdrecfec});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAUQ6 = false ;
         A14707DRecVal = P0AUQ4_A14707DRecVal[0] ;
         A14676DRecFec = P0AUQ4_A14676DRecFec[0] ;
         A14706DRecPLC = P0AUQ4_A14706DRecPLC[0] ;
         A14705DRecMaqCod = P0AUQ4_A14705DRecMaqCod[0] ;
         A14675DRecId = P0AUQ4_A14675DRecId[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AUQ4_A14707DRecVal[0], A14707DRecVal) == 0 ) )
         {
            brkAUQ6 = false ;
            A14675DRecId = P0AUQ4_A14675DRecId[0] ;
            AV26count = (long)(AV26count+1) ;
            brkAUQ6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A14707DRecVal)==0) )
         {
            AV21Option = A14707DRecVal ;
            AV22Options.add(AV21Option, 0);
            AV25OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV22Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAUQ6 )
         {
            brkAUQ6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = drecwwgetfilterdata.this.AV35OptionsJson;
      this.aP4[0] = drecwwgetfilterdata.this.AV36OptionsDescJson;
      this.aP5[0] = drecwwgetfilterdata.this.AV37OptionIndexesJson;
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
      AV38FilterFullText = "" ;
      AV12TFDRecMaqCod = "" ;
      AV13TFDRecMaqCod_Sel = "" ;
      AV14TFDRecPLC = "" ;
      AV15TFDRecPLC_Sel = "" ;
      AV16TFDRecVal = "" ;
      AV17TFDRecVal_Sel = "" ;
      AV18TFDRecFec = GXutil.resetTime( GXutil.nullDate() );
      A14705DRecMaqCod = "" ;
      AV43Ingenieria_drecwwds_1_filterfulltext = "" ;
      AV46Ingenieria_drecwwds_4_tfdrecmaqcod = "" ;
      AV47Ingenieria_drecwwds_5_tfdrecmaqcod_sel = "" ;
      AV48Ingenieria_drecwwds_6_tfdrecplc = "" ;
      AV49Ingenieria_drecwwds_7_tfdrecplc_sel = "" ;
      AV50Ingenieria_drecwwds_8_tfdrecval = "" ;
      AV51Ingenieria_drecwwds_9_tfdrecval_sel = "" ;
      AV52Ingenieria_drecwwds_10_tfdrecfec = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV43Ingenieria_drecwwds_1_filterfulltext = "" ;
      lV46Ingenieria_drecwwds_4_tfdrecmaqcod = "" ;
      lV48Ingenieria_drecwwds_6_tfdrecplc = "" ;
      lV50Ingenieria_drecwwds_8_tfdrecval = "" ;
      A14706DRecPLC = "" ;
      A14707DRecVal = "" ;
      A14676DRecFec = GXutil.resetTime( GXutil.nullDate() );
      P0AUQ2_A14705DRecMaqCod = new String[] {""} ;
      P0AUQ2_A14676DRecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AUQ2_A14707DRecVal = new String[] {""} ;
      P0AUQ2_A14706DRecPLC = new String[] {""} ;
      P0AUQ2_A14675DRecId = new long[1] ;
      AV21Option = "" ;
      P0AUQ3_A14706DRecPLC = new String[] {""} ;
      P0AUQ3_A14676DRecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AUQ3_A14707DRecVal = new String[] {""} ;
      P0AUQ3_A14705DRecMaqCod = new String[] {""} ;
      P0AUQ3_A14675DRecId = new long[1] ;
      P0AUQ4_A14707DRecVal = new String[] {""} ;
      P0AUQ4_A14676DRecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AUQ4_A14706DRecPLC = new String[] {""} ;
      P0AUQ4_A14705DRecMaqCod = new String[] {""} ;
      P0AUQ4_A14675DRecId = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.drecwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AUQ2_A14705DRecMaqCod, P0AUQ2_A14676DRecFec, P0AUQ2_A14707DRecVal, P0AUQ2_A14706DRecPLC, P0AUQ2_A14675DRecId
            }
            , new Object[] {
            P0AUQ3_A14706DRecPLC, P0AUQ3_A14676DRecFec, P0AUQ3_A14707DRecVal, P0AUQ3_A14705DRecMaqCod, P0AUQ3_A14675DRecId
            }
            , new Object[] {
            P0AUQ4_A14707DRecVal, P0AUQ4_A14676DRecFec, P0AUQ4_A14706DRecPLC, P0AUQ4_A14705DRecMaqCod, P0AUQ4_A14675DRecId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV41GXV1 ;
   private long AV10TFDRecId ;
   private long AV11TFDRecId_To ;
   private long AV44Ingenieria_drecwwds_2_tfdrecid ;
   private long AV45Ingenieria_drecwwds_3_tfdrecid_to ;
   private long A14675DRecId ;
   private long AV26count ;
   private String AV12TFDRecMaqCod ;
   private String AV13TFDRecMaqCod_Sel ;
   private String AV16TFDRecVal ;
   private String AV17TFDRecVal_Sel ;
   private String A14705DRecMaqCod ;
   private String AV46Ingenieria_drecwwds_4_tfdrecmaqcod ;
   private String AV47Ingenieria_drecwwds_5_tfdrecmaqcod_sel ;
   private String AV50Ingenieria_drecwwds_8_tfdrecval ;
   private String AV51Ingenieria_drecwwds_9_tfdrecval_sel ;
   private String scmdbuf ;
   private String lV46Ingenieria_drecwwds_4_tfdrecmaqcod ;
   private String lV50Ingenieria_drecwwds_8_tfdrecval ;
   private String A14707DRecVal ;
   private java.util.Date AV18TFDRecFec ;
   private java.util.Date AV52Ingenieria_drecwwds_10_tfdrecfec ;
   private java.util.Date A14676DRecFec ;
   private boolean returnInSub ;
   private boolean brkAUQ2 ;
   private boolean brkAUQ4 ;
   private boolean brkAUQ6 ;
   private String AV35OptionsJson ;
   private String AV36OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV32DDOName ;
   private String AV33SearchTxt ;
   private String AV34SearchTxtTo ;
   private String AV38FilterFullText ;
   private String AV14TFDRecPLC ;
   private String AV15TFDRecPLC_Sel ;
   private String AV43Ingenieria_drecwwds_1_filterfulltext ;
   private String AV48Ingenieria_drecwwds_6_tfdrecplc ;
   private String AV49Ingenieria_drecwwds_7_tfdrecplc_sel ;
   private String lV43Ingenieria_drecwwds_1_filterfulltext ;
   private String lV48Ingenieria_drecwwds_6_tfdrecplc ;
   private String A14706DRecPLC ;
   private String AV21Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AUQ2_A14705DRecMaqCod ;
   private java.util.Date[] P0AUQ2_A14676DRecFec ;
   private String[] P0AUQ2_A14707DRecVal ;
   private String[] P0AUQ2_A14706DRecPLC ;
   private long[] P0AUQ2_A14675DRecId ;
   private String[] P0AUQ3_A14706DRecPLC ;
   private java.util.Date[] P0AUQ3_A14676DRecFec ;
   private String[] P0AUQ3_A14707DRecVal ;
   private String[] P0AUQ3_A14705DRecMaqCod ;
   private long[] P0AUQ3_A14675DRecId ;
   private String[] P0AUQ4_A14707DRecVal ;
   private java.util.Date[] P0AUQ4_A14676DRecFec ;
   private String[] P0AUQ4_A14706DRecPLC ;
   private String[] P0AUQ4_A14705DRecMaqCod ;
   private long[] P0AUQ4_A14675DRecId ;
   private GXSimpleCollection<String> AV22Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV25OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class drecwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AUQ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV43Ingenieria_drecwwds_1_filterfulltext ,
                                          long AV44Ingenieria_drecwwds_2_tfdrecid ,
                                          long AV45Ingenieria_drecwwds_3_tfdrecid_to ,
                                          String AV47Ingenieria_drecwwds_5_tfdrecmaqcod_sel ,
                                          String AV46Ingenieria_drecwwds_4_tfdrecmaqcod ,
                                          String AV49Ingenieria_drecwwds_7_tfdrecplc_sel ,
                                          String AV48Ingenieria_drecwwds_6_tfdrecplc ,
                                          String AV51Ingenieria_drecwwds_9_tfdrecval_sel ,
                                          String AV50Ingenieria_drecwwds_8_tfdrecval ,
                                          java.util.Date AV52Ingenieria_drecwwds_10_tfdrecfec ,
                                          long A14675DRecId ,
                                          String A14705DRecMaqCod ,
                                          String A14706DRecPLC ,
                                          String A14707DRecVal ,
                                          java.util.Date A14676DRecFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[13];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT DRecMaqCod, DRecFec, DRecVal, DRecPLC, DRecId FROM DRec" ;
      if ( ! (GXutil.strcmp("", AV43Ingenieria_drecwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(DRecId,'999999999990'), 2) like '%' || ?) or ( UPPER(DRecMaqCod) like '%' || UPPER(?)) or ( UPPER(DRecPLC) like '%' || UPPER(?)) or ( UPPER(DRecVal) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV44Ingenieria_drecwwds_2_tfdrecid) )
      {
         addWhere(sWhereString, "(DRecId >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV45Ingenieria_drecwwds_3_tfdrecid_to) )
      {
         addWhere(sWhereString, "(DRecId <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Ingenieria_drecwwds_5_tfdrecmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV46Ingenieria_drecwwds_4_tfdrecmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DRecMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Ingenieria_drecwwds_5_tfdrecmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(DRecMaqCod = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Ingenieria_drecwwds_7_tfdrecplc_sel)==0) && ( ! (GXutil.strcmp("", AV48Ingenieria_drecwwds_6_tfdrecplc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DRecPLC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Ingenieria_drecwwds_7_tfdrecplc_sel)==0) )
      {
         addWhere(sWhereString, "(DRecPLC = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Ingenieria_drecwwds_9_tfdrecval_sel)==0) && ( ! (GXutil.strcmp("", AV50Ingenieria_drecwwds_8_tfdrecval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DRecVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Ingenieria_drecwwds_9_tfdrecval_sel)==0) )
      {
         addWhere(sWhereString, "(DRecVal = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV52Ingenieria_drecwwds_10_tfdrecfec) )
      {
         addWhere(sWhereString, "(DRecFec >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY DRecMaqCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AUQ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV43Ingenieria_drecwwds_1_filterfulltext ,
                                          long AV44Ingenieria_drecwwds_2_tfdrecid ,
                                          long AV45Ingenieria_drecwwds_3_tfdrecid_to ,
                                          String AV47Ingenieria_drecwwds_5_tfdrecmaqcod_sel ,
                                          String AV46Ingenieria_drecwwds_4_tfdrecmaqcod ,
                                          String AV49Ingenieria_drecwwds_7_tfdrecplc_sel ,
                                          String AV48Ingenieria_drecwwds_6_tfdrecplc ,
                                          String AV51Ingenieria_drecwwds_9_tfdrecval_sel ,
                                          String AV50Ingenieria_drecwwds_8_tfdrecval ,
                                          java.util.Date AV52Ingenieria_drecwwds_10_tfdrecfec ,
                                          long A14675DRecId ,
                                          String A14705DRecMaqCod ,
                                          String A14706DRecPLC ,
                                          String A14707DRecVal ,
                                          java.util.Date A14676DRecFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[13];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT DRecPLC, DRecFec, DRecVal, DRecMaqCod, DRecId FROM DRec" ;
      if ( ! (GXutil.strcmp("", AV43Ingenieria_drecwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(DRecId,'999999999990'), 2) like '%' || ?) or ( UPPER(DRecMaqCod) like '%' || UPPER(?)) or ( UPPER(DRecPLC) like '%' || UPPER(?)) or ( UPPER(DRecVal) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV44Ingenieria_drecwwds_2_tfdrecid) )
      {
         addWhere(sWhereString, "(DRecId >= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (0==AV45Ingenieria_drecwwds_3_tfdrecid_to) )
      {
         addWhere(sWhereString, "(DRecId <= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Ingenieria_drecwwds_5_tfdrecmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV46Ingenieria_drecwwds_4_tfdrecmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DRecMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Ingenieria_drecwwds_5_tfdrecmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(DRecMaqCod = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Ingenieria_drecwwds_7_tfdrecplc_sel)==0) && ( ! (GXutil.strcmp("", AV48Ingenieria_drecwwds_6_tfdrecplc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DRecPLC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Ingenieria_drecwwds_7_tfdrecplc_sel)==0) )
      {
         addWhere(sWhereString, "(DRecPLC = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Ingenieria_drecwwds_9_tfdrecval_sel)==0) && ( ! (GXutil.strcmp("", AV50Ingenieria_drecwwds_8_tfdrecval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DRecVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Ingenieria_drecwwds_9_tfdrecval_sel)==0) )
      {
         addWhere(sWhereString, "(DRecVal = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV52Ingenieria_drecwwds_10_tfdrecfec) )
      {
         addWhere(sWhereString, "(DRecFec >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY DRecPLC" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0AUQ4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV43Ingenieria_drecwwds_1_filterfulltext ,
                                          long AV44Ingenieria_drecwwds_2_tfdrecid ,
                                          long AV45Ingenieria_drecwwds_3_tfdrecid_to ,
                                          String AV47Ingenieria_drecwwds_5_tfdrecmaqcod_sel ,
                                          String AV46Ingenieria_drecwwds_4_tfdrecmaqcod ,
                                          String AV49Ingenieria_drecwwds_7_tfdrecplc_sel ,
                                          String AV48Ingenieria_drecwwds_6_tfdrecplc ,
                                          String AV51Ingenieria_drecwwds_9_tfdrecval_sel ,
                                          String AV50Ingenieria_drecwwds_8_tfdrecval ,
                                          java.util.Date AV52Ingenieria_drecwwds_10_tfdrecfec ,
                                          long A14675DRecId ,
                                          String A14705DRecMaqCod ,
                                          String A14706DRecPLC ,
                                          String A14707DRecVal ,
                                          java.util.Date A14676DRecFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[13];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT DRecVal, DRecFec, DRecPLC, DRecMaqCod, DRecId FROM DRec" ;
      if ( ! (GXutil.strcmp("", AV43Ingenieria_drecwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(DRecId,'999999999990'), 2) like '%' || ?) or ( UPPER(DRecMaqCod) like '%' || UPPER(?)) or ( UPPER(DRecPLC) like '%' || UPPER(?)) or ( UPPER(DRecVal) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV44Ingenieria_drecwwds_2_tfdrecid) )
      {
         addWhere(sWhereString, "(DRecId >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV45Ingenieria_drecwwds_3_tfdrecid_to) )
      {
         addWhere(sWhereString, "(DRecId <= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Ingenieria_drecwwds_5_tfdrecmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV46Ingenieria_drecwwds_4_tfdrecmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DRecMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Ingenieria_drecwwds_5_tfdrecmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(DRecMaqCod = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Ingenieria_drecwwds_7_tfdrecplc_sel)==0) && ( ! (GXutil.strcmp("", AV48Ingenieria_drecwwds_6_tfdrecplc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DRecPLC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Ingenieria_drecwwds_7_tfdrecplc_sel)==0) )
      {
         addWhere(sWhereString, "(DRecPLC = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Ingenieria_drecwwds_9_tfdrecval_sel)==0) && ( ! (GXutil.strcmp("", AV50Ingenieria_drecwwds_8_tfdrecval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DRecVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Ingenieria_drecwwds_9_tfdrecval_sel)==0) )
      {
         addWhere(sWhereString, "(DRecVal = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV52Ingenieria_drecwwds_10_tfdrecfec) )
      {
         addWhere(sWhereString, "(DRecFec >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY DRecVal" ;
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
                  return conditional_P0AUQ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).longValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] );
            case 1 :
                  return conditional_P0AUQ3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).longValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] );
            case 2 :
                  return conditional_P0AUQ4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).longValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AUQ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AUQ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AUQ4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2, true);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2, true);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 12);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2, true);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((long[]) buf[4])[0] = rslt.getLong(5);
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
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[17]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[18]).longValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 12);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 12);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[25], false, true);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[17]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[18]).longValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 12);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 12);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[25], false, true);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[17]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[18]).longValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 12);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 12);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[25], false, true);
               }
               return;
      }
   }

}

