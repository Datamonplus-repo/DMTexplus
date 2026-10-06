package app.asyncbatch ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class listjobitemgetfilterdata extends GXProcedure
{
   public listjobitemgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listjobitemgetfilterdata.class ), "" );
   }

   public listjobitemgetfilterdata( int remoteHandle ,
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
      listjobitemgetfilterdata.this.aP5 = new String[] {""};
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
      listjobitemgetfilterdata.this.AV32DDOName = aP0;
      listjobitemgetfilterdata.this.AV33SearchTxt = aP1;
      listjobitemgetfilterdata.this.AV34SearchTxtTo = aP2;
      listjobitemgetfilterdata.this.aP3 = aP3;
      listjobitemgetfilterdata.this.aP4 = aP4;
      listjobitemgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_DOCLBL") == 0 )
      {
         /* Execute user subroutine: 'LOADDOCLBLOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_ITMSTS") == 0 )
      {
         /* Execute user subroutine: 'LOADITMSTSOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_ITMERR") == 0 )
      {
         /* Execute user subroutine: 'LOADITMERROPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("AsyncBatch.ListJobItemGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "AsyncBatch.ListJobItemGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("AsyncBatch.ListJobItemGridState"), null, null);
      }
      AV41GXV1 = 1 ;
      while ( AV41GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV41GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDOCID") == 0 )
         {
            AV10TFDocId = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFDocId_To = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDOCLBL") == 0 )
         {
            AV12TFDocLbl = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDOCLBL_SEL") == 0 )
         {
            AV13TFDocLbl_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFITMDTSTART") == 0 )
         {
            AV14TFItmDtStart = localUtil.ctot( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFITMDTEND") == 0 )
         {
            AV15TFItmDtEnd = localUtil.ctot( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFITMSTS") == 0 )
         {
            AV18TFItmSts = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFITMSTS_SEL") == 0 )
         {
            AV19TFItmSts_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFITMERR") == 0 )
         {
            AV16TFItmErr = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFITMERR_SEL") == 0 )
         {
            AV17TFItmErr_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&JOBID") == 0 )
         {
            AV38JobId = GXutil.strToGuid(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
         }
         AV41GXV1 = (int)(AV41GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADDOCLBLOPTIONS' Routine */
      returnInSub = false ;
      AV12TFDocLbl = AV33SearchTxt ;
      AV13TFDocLbl_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV10TFDocId) ,
                                           Integer.valueOf(AV11TFDocId_To) ,
                                           AV13TFDocLbl_Sel ,
                                           AV12TFDocLbl ,
                                           AV14TFItmDtStart ,
                                           AV15TFItmDtEnd ,
                                           AV19TFItmSts_Sel ,
                                           AV18TFItmSts ,
                                           AV17TFItmErr_Sel ,
                                           AV16TFItmErr ,
                                           Integer.valueOf(A14470DocId) ,
                                           A14471DocLbl ,
                                           A14481ItmDtStart ,
                                           A14482ItmDtEnd ,
                                           A14472ItmSts ,
                                           A14486ItmErr ,
                                           AV38JobId ,
                                           A14423JobId } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.UUID, TypeConstants.UUID
                                           }
      });
      lV12TFDocLbl = GXutil.concat( GXutil.rtrim( AV12TFDocLbl), "%", "") ;
      lV18TFItmSts = GXutil.concat( GXutil.rtrim( AV18TFItmSts), "%", "") ;
      lV16TFItmErr = GXutil.concat( GXutil.rtrim( AV16TFItmErr), "%", "") ;
      /* Using cursor P0AOU2 */
      pr_default.execute(0, new Object[] {AV38JobId, Integer.valueOf(AV10TFDocId), Integer.valueOf(AV11TFDocId_To), lV12TFDocLbl, AV13TFDocLbl_Sel, AV14TFItmDtStart, AV15TFItmDtEnd, lV18TFItmSts, AV19TFItmSts_Sel, lV16TFItmErr, AV17TFItmErr_Sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAOU2 = false ;
         A14423JobId = P0AOU2_A14423JobId[0] ;
         A14471DocLbl = P0AOU2_A14471DocLbl[0] ;
         n14471DocLbl = P0AOU2_n14471DocLbl[0] ;
         A14486ItmErr = P0AOU2_A14486ItmErr[0] ;
         n14486ItmErr = P0AOU2_n14486ItmErr[0] ;
         A14472ItmSts = P0AOU2_A14472ItmSts[0] ;
         n14472ItmSts = P0AOU2_n14472ItmSts[0] ;
         A14482ItmDtEnd = P0AOU2_A14482ItmDtEnd[0] ;
         n14482ItmDtEnd = P0AOU2_n14482ItmDtEnd[0] ;
         A14481ItmDtStart = P0AOU2_A14481ItmDtStart[0] ;
         n14481ItmDtStart = P0AOU2_n14481ItmDtStart[0] ;
         A14470DocId = P0AOU2_A14470DocId[0] ;
         n14470DocId = P0AOU2_n14470DocId[0] ;
         A14468ItmId = P0AOU2_A14468ItmId[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && P0AOU2_A14423JobId[0].equals( A14423JobId ) && ( GXutil.strcmp(P0AOU2_A14471DocLbl[0], A14471DocLbl) == 0 ) )
         {
            brkAOU2 = false ;
            A14468ItmId = P0AOU2_A14468ItmId[0] ;
            AV26count = (long)(AV26count+1) ;
            brkAOU2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A14471DocLbl)==0) )
         {
            AV21Option = A14471DocLbl ;
            AV22Options.add(AV21Option, 0);
            AV25OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV22Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAOU2 )
         {
            brkAOU2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADITMSTSOPTIONS' Routine */
      returnInSub = false ;
      AV18TFItmSts = AV33SearchTxt ;
      AV19TFItmSts_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV10TFDocId) ,
                                           Integer.valueOf(AV11TFDocId_To) ,
                                           AV13TFDocLbl_Sel ,
                                           AV12TFDocLbl ,
                                           AV14TFItmDtStart ,
                                           AV15TFItmDtEnd ,
                                           AV19TFItmSts_Sel ,
                                           AV18TFItmSts ,
                                           AV17TFItmErr_Sel ,
                                           AV16TFItmErr ,
                                           Integer.valueOf(A14470DocId) ,
                                           A14471DocLbl ,
                                           A14481ItmDtStart ,
                                           A14482ItmDtEnd ,
                                           A14472ItmSts ,
                                           A14486ItmErr ,
                                           AV38JobId ,
                                           A14423JobId } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.UUID, TypeConstants.UUID
                                           }
      });
      lV12TFDocLbl = GXutil.concat( GXutil.rtrim( AV12TFDocLbl), "%", "") ;
      lV18TFItmSts = GXutil.concat( GXutil.rtrim( AV18TFItmSts), "%", "") ;
      lV16TFItmErr = GXutil.concat( GXutil.rtrim( AV16TFItmErr), "%", "") ;
      /* Using cursor P0AOU3 */
      pr_default.execute(1, new Object[] {AV38JobId, Integer.valueOf(AV10TFDocId), Integer.valueOf(AV11TFDocId_To), lV12TFDocLbl, AV13TFDocLbl_Sel, AV14TFItmDtStart, AV15TFItmDtEnd, lV18TFItmSts, AV19TFItmSts_Sel, lV16TFItmErr, AV17TFItmErr_Sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAOU4 = false ;
         A14423JobId = P0AOU3_A14423JobId[0] ;
         A14472ItmSts = P0AOU3_A14472ItmSts[0] ;
         n14472ItmSts = P0AOU3_n14472ItmSts[0] ;
         A14486ItmErr = P0AOU3_A14486ItmErr[0] ;
         n14486ItmErr = P0AOU3_n14486ItmErr[0] ;
         A14482ItmDtEnd = P0AOU3_A14482ItmDtEnd[0] ;
         n14482ItmDtEnd = P0AOU3_n14482ItmDtEnd[0] ;
         A14481ItmDtStart = P0AOU3_A14481ItmDtStart[0] ;
         n14481ItmDtStart = P0AOU3_n14481ItmDtStart[0] ;
         A14471DocLbl = P0AOU3_A14471DocLbl[0] ;
         n14471DocLbl = P0AOU3_n14471DocLbl[0] ;
         A14470DocId = P0AOU3_A14470DocId[0] ;
         n14470DocId = P0AOU3_n14470DocId[0] ;
         A14468ItmId = P0AOU3_A14468ItmId[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && P0AOU3_A14423JobId[0].equals( A14423JobId ) && ( GXutil.strcmp(P0AOU3_A14472ItmSts[0], A14472ItmSts) == 0 ) )
         {
            brkAOU4 = false ;
            A14468ItmId = P0AOU3_A14468ItmId[0] ;
            AV26count = (long)(AV26count+1) ;
            brkAOU4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A14472ItmSts)==0) )
         {
            AV21Option = A14472ItmSts ;
            AV22Options.add(AV21Option, 0);
            AV25OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV22Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAOU4 )
         {
            brkAOU4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADITMERROPTIONS' Routine */
      returnInSub = false ;
      AV16TFItmErr = AV33SearchTxt ;
      AV17TFItmErr_Sel = "" ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Integer.valueOf(AV10TFDocId) ,
                                           Integer.valueOf(AV11TFDocId_To) ,
                                           AV13TFDocLbl_Sel ,
                                           AV12TFDocLbl ,
                                           AV14TFItmDtStart ,
                                           AV15TFItmDtEnd ,
                                           AV19TFItmSts_Sel ,
                                           AV18TFItmSts ,
                                           AV17TFItmErr_Sel ,
                                           AV16TFItmErr ,
                                           Integer.valueOf(A14470DocId) ,
                                           A14471DocLbl ,
                                           A14481ItmDtStart ,
                                           A14482ItmDtEnd ,
                                           A14472ItmSts ,
                                           A14486ItmErr ,
                                           AV38JobId ,
                                           A14423JobId } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.UUID, TypeConstants.UUID
                                           }
      });
      lV12TFDocLbl = GXutil.concat( GXutil.rtrim( AV12TFDocLbl), "%", "") ;
      lV18TFItmSts = GXutil.concat( GXutil.rtrim( AV18TFItmSts), "%", "") ;
      lV16TFItmErr = GXutil.concat( GXutil.rtrim( AV16TFItmErr), "%", "") ;
      /* Using cursor P0AOU4 */
      pr_default.execute(2, new Object[] {AV38JobId, Integer.valueOf(AV10TFDocId), Integer.valueOf(AV11TFDocId_To), lV12TFDocLbl, AV13TFDocLbl_Sel, AV14TFItmDtStart, AV15TFItmDtEnd, lV18TFItmSts, AV19TFItmSts_Sel, lV16TFItmErr, AV17TFItmErr_Sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAOU6 = false ;
         A14423JobId = P0AOU4_A14423JobId[0] ;
         A14486ItmErr = P0AOU4_A14486ItmErr[0] ;
         n14486ItmErr = P0AOU4_n14486ItmErr[0] ;
         A14472ItmSts = P0AOU4_A14472ItmSts[0] ;
         n14472ItmSts = P0AOU4_n14472ItmSts[0] ;
         A14482ItmDtEnd = P0AOU4_A14482ItmDtEnd[0] ;
         n14482ItmDtEnd = P0AOU4_n14482ItmDtEnd[0] ;
         A14481ItmDtStart = P0AOU4_A14481ItmDtStart[0] ;
         n14481ItmDtStart = P0AOU4_n14481ItmDtStart[0] ;
         A14471DocLbl = P0AOU4_A14471DocLbl[0] ;
         n14471DocLbl = P0AOU4_n14471DocLbl[0] ;
         A14470DocId = P0AOU4_A14470DocId[0] ;
         n14470DocId = P0AOU4_n14470DocId[0] ;
         A14468ItmId = P0AOU4_A14468ItmId[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && P0AOU4_A14423JobId[0].equals( A14423JobId ) && ( GXutil.strcmp(P0AOU4_A14486ItmErr[0], A14486ItmErr) == 0 ) )
         {
            brkAOU6 = false ;
            A14468ItmId = P0AOU4_A14468ItmId[0] ;
            AV26count = (long)(AV26count+1) ;
            brkAOU6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A14486ItmErr)==0) )
         {
            AV21Option = A14486ItmErr ;
            AV22Options.add(AV21Option, 0);
            AV25OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV22Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAOU6 )
         {
            brkAOU6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = listjobitemgetfilterdata.this.AV35OptionsJson;
      this.aP4[0] = listjobitemgetfilterdata.this.AV36OptionsDescJson;
      this.aP5[0] = listjobitemgetfilterdata.this.AV37OptionIndexesJson;
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
      AV12TFDocLbl = "" ;
      AV13TFDocLbl_Sel = "" ;
      AV14TFItmDtStart = GXutil.resetTime( GXutil.nullDate() );
      AV15TFItmDtEnd = GXutil.resetTime( GXutil.nullDate() );
      AV18TFItmSts = "" ;
      AV19TFItmSts_Sel = "" ;
      AV16TFItmErr = "" ;
      AV17TFItmErr_Sel = "" ;
      AV38JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      scmdbuf = "" ;
      lV12TFDocLbl = "" ;
      lV18TFItmSts = "" ;
      lV16TFItmErr = "" ;
      A14471DocLbl = "" ;
      A14481ItmDtStart = GXutil.resetTime( GXutil.nullDate() );
      A14482ItmDtEnd = GXutil.resetTime( GXutil.nullDate() );
      A14472ItmSts = "" ;
      A14486ItmErr = "" ;
      A14423JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      P0AOU2_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      P0AOU2_A14471DocLbl = new String[] {""} ;
      P0AOU2_n14471DocLbl = new boolean[] {false} ;
      P0AOU2_A14486ItmErr = new String[] {""} ;
      P0AOU2_n14486ItmErr = new boolean[] {false} ;
      P0AOU2_A14472ItmSts = new String[] {""} ;
      P0AOU2_n14472ItmSts = new boolean[] {false} ;
      P0AOU2_A14482ItmDtEnd = new java.util.Date[] {GXutil.nullDate()} ;
      P0AOU2_n14482ItmDtEnd = new boolean[] {false} ;
      P0AOU2_A14481ItmDtStart = new java.util.Date[] {GXutil.nullDate()} ;
      P0AOU2_n14481ItmDtStart = new boolean[] {false} ;
      P0AOU2_A14470DocId = new int[1] ;
      P0AOU2_n14470DocId = new boolean[] {false} ;
      P0AOU2_A14468ItmId = new long[1] ;
      AV21Option = "" ;
      P0AOU3_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      P0AOU3_A14472ItmSts = new String[] {""} ;
      P0AOU3_n14472ItmSts = new boolean[] {false} ;
      P0AOU3_A14486ItmErr = new String[] {""} ;
      P0AOU3_n14486ItmErr = new boolean[] {false} ;
      P0AOU3_A14482ItmDtEnd = new java.util.Date[] {GXutil.nullDate()} ;
      P0AOU3_n14482ItmDtEnd = new boolean[] {false} ;
      P0AOU3_A14481ItmDtStart = new java.util.Date[] {GXutil.nullDate()} ;
      P0AOU3_n14481ItmDtStart = new boolean[] {false} ;
      P0AOU3_A14471DocLbl = new String[] {""} ;
      P0AOU3_n14471DocLbl = new boolean[] {false} ;
      P0AOU3_A14470DocId = new int[1] ;
      P0AOU3_n14470DocId = new boolean[] {false} ;
      P0AOU3_A14468ItmId = new long[1] ;
      P0AOU4_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      P0AOU4_A14486ItmErr = new String[] {""} ;
      P0AOU4_n14486ItmErr = new boolean[] {false} ;
      P0AOU4_A14472ItmSts = new String[] {""} ;
      P0AOU4_n14472ItmSts = new boolean[] {false} ;
      P0AOU4_A14482ItmDtEnd = new java.util.Date[] {GXutil.nullDate()} ;
      P0AOU4_n14482ItmDtEnd = new boolean[] {false} ;
      P0AOU4_A14481ItmDtStart = new java.util.Date[] {GXutil.nullDate()} ;
      P0AOU4_n14481ItmDtStart = new boolean[] {false} ;
      P0AOU4_A14471DocLbl = new String[] {""} ;
      P0AOU4_n14471DocLbl = new boolean[] {false} ;
      P0AOU4_A14470DocId = new int[1] ;
      P0AOU4_n14470DocId = new boolean[] {false} ;
      P0AOU4_A14468ItmId = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.asyncbatch.listjobitemgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AOU2_A14423JobId, P0AOU2_A14471DocLbl, P0AOU2_n14471DocLbl, P0AOU2_A14486ItmErr, P0AOU2_n14486ItmErr, P0AOU2_A14472ItmSts, P0AOU2_n14472ItmSts, P0AOU2_A14482ItmDtEnd, P0AOU2_n14482ItmDtEnd, P0AOU2_A14481ItmDtStart,
            P0AOU2_n14481ItmDtStart, P0AOU2_A14470DocId, P0AOU2_n14470DocId, P0AOU2_A14468ItmId
            }
            , new Object[] {
            P0AOU3_A14423JobId, P0AOU3_A14472ItmSts, P0AOU3_n14472ItmSts, P0AOU3_A14486ItmErr, P0AOU3_n14486ItmErr, P0AOU3_A14482ItmDtEnd, P0AOU3_n14482ItmDtEnd, P0AOU3_A14481ItmDtStart, P0AOU3_n14481ItmDtStart, P0AOU3_A14471DocLbl,
            P0AOU3_n14471DocLbl, P0AOU3_A14470DocId, P0AOU3_n14470DocId, P0AOU3_A14468ItmId
            }
            , new Object[] {
            P0AOU4_A14423JobId, P0AOU4_A14486ItmErr, P0AOU4_n14486ItmErr, P0AOU4_A14472ItmSts, P0AOU4_n14472ItmSts, P0AOU4_A14482ItmDtEnd, P0AOU4_n14482ItmDtEnd, P0AOU4_A14481ItmDtStart, P0AOU4_n14481ItmDtStart, P0AOU4_A14471DocLbl,
            P0AOU4_n14471DocLbl, P0AOU4_A14470DocId, P0AOU4_n14470DocId, P0AOU4_A14468ItmId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV41GXV1 ;
   private int AV10TFDocId ;
   private int AV11TFDocId_To ;
   private int A14470DocId ;
   private long A14468ItmId ;
   private long AV26count ;
   private String scmdbuf ;
   private java.util.Date AV14TFItmDtStart ;
   private java.util.Date AV15TFItmDtEnd ;
   private java.util.Date A14481ItmDtStart ;
   private java.util.Date A14482ItmDtEnd ;
   private boolean returnInSub ;
   private boolean brkAOU2 ;
   private boolean n14471DocLbl ;
   private boolean n14486ItmErr ;
   private boolean n14472ItmSts ;
   private boolean n14482ItmDtEnd ;
   private boolean n14481ItmDtStart ;
   private boolean n14470DocId ;
   private boolean brkAOU4 ;
   private boolean brkAOU6 ;
   private String AV35OptionsJson ;
   private String AV36OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV32DDOName ;
   private String AV33SearchTxt ;
   private String AV34SearchTxtTo ;
   private String AV12TFDocLbl ;
   private String AV13TFDocLbl_Sel ;
   private String AV18TFItmSts ;
   private String AV19TFItmSts_Sel ;
   private String AV16TFItmErr ;
   private String AV17TFItmErr_Sel ;
   private String lV12TFDocLbl ;
   private String lV18TFItmSts ;
   private String lV16TFItmErr ;
   private String A14471DocLbl ;
   private String A14472ItmSts ;
   private String A14486ItmErr ;
   private String AV21Option ;
   private java.util.UUID AV38JobId ;
   private java.util.UUID A14423JobId ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private java.util.UUID[] P0AOU2_A14423JobId ;
   private String[] P0AOU2_A14471DocLbl ;
   private boolean[] P0AOU2_n14471DocLbl ;
   private String[] P0AOU2_A14486ItmErr ;
   private boolean[] P0AOU2_n14486ItmErr ;
   private String[] P0AOU2_A14472ItmSts ;
   private boolean[] P0AOU2_n14472ItmSts ;
   private java.util.Date[] P0AOU2_A14482ItmDtEnd ;
   private boolean[] P0AOU2_n14482ItmDtEnd ;
   private java.util.Date[] P0AOU2_A14481ItmDtStart ;
   private boolean[] P0AOU2_n14481ItmDtStart ;
   private int[] P0AOU2_A14470DocId ;
   private boolean[] P0AOU2_n14470DocId ;
   private long[] P0AOU2_A14468ItmId ;
   private java.util.UUID[] P0AOU3_A14423JobId ;
   private String[] P0AOU3_A14472ItmSts ;
   private boolean[] P0AOU3_n14472ItmSts ;
   private String[] P0AOU3_A14486ItmErr ;
   private boolean[] P0AOU3_n14486ItmErr ;
   private java.util.Date[] P0AOU3_A14482ItmDtEnd ;
   private boolean[] P0AOU3_n14482ItmDtEnd ;
   private java.util.Date[] P0AOU3_A14481ItmDtStart ;
   private boolean[] P0AOU3_n14481ItmDtStart ;
   private String[] P0AOU3_A14471DocLbl ;
   private boolean[] P0AOU3_n14471DocLbl ;
   private int[] P0AOU3_A14470DocId ;
   private boolean[] P0AOU3_n14470DocId ;
   private long[] P0AOU3_A14468ItmId ;
   private java.util.UUID[] P0AOU4_A14423JobId ;
   private String[] P0AOU4_A14486ItmErr ;
   private boolean[] P0AOU4_n14486ItmErr ;
   private String[] P0AOU4_A14472ItmSts ;
   private boolean[] P0AOU4_n14472ItmSts ;
   private java.util.Date[] P0AOU4_A14482ItmDtEnd ;
   private boolean[] P0AOU4_n14482ItmDtEnd ;
   private java.util.Date[] P0AOU4_A14481ItmDtStart ;
   private boolean[] P0AOU4_n14481ItmDtStart ;
   private String[] P0AOU4_A14471DocLbl ;
   private boolean[] P0AOU4_n14471DocLbl ;
   private int[] P0AOU4_A14470DocId ;
   private boolean[] P0AOU4_n14470DocId ;
   private long[] P0AOU4_A14468ItmId ;
   private GXSimpleCollection<String> AV22Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV25OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class listjobitemgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AOU2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV10TFDocId ,
                                          int AV11TFDocId_To ,
                                          String AV13TFDocLbl_Sel ,
                                          String AV12TFDocLbl ,
                                          java.util.Date AV14TFItmDtStart ,
                                          java.util.Date AV15TFItmDtEnd ,
                                          String AV19TFItmSts_Sel ,
                                          String AV18TFItmSts ,
                                          String AV17TFItmErr_Sel ,
                                          String AV16TFItmErr ,
                                          int A14470DocId ,
                                          String A14471DocLbl ,
                                          java.util.Date A14481ItmDtStart ,
                                          java.util.Date A14482ItmDtEnd ,
                                          String A14472ItmSts ,
                                          String A14486ItmErr ,
                                          java.util.UUID AV38JobId ,
                                          java.util.UUID A14423JobId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[11];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT JobId, DocLbl, ItmErr, ItmSts, ItmDtEnd, ItmDtStart, DocId, ItmId FROM TEXPLUSNET.TXPJOBITE" ;
      addWhere(sWhereString, "(JobId = ?)");
      if ( ! (0==AV10TFDocId) )
      {
         addWhere(sWhereString, "(DocId >= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV11TFDocId_To) )
      {
         addWhere(sWhereString, "(DocId <= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFDocLbl_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFDocLbl)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DocLbl) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFDocLbl_Sel)==0) )
      {
         addWhere(sWhereString, "(DocLbl = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV14TFItmDtStart) )
      {
         addWhere(sWhereString, "(ItmDtStart >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV15TFItmDtEnd) )
      {
         addWhere(sWhereString, "(ItmDtEnd >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFItmSts_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFItmSts)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ItmSts) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFItmSts_Sel)==0) )
      {
         addWhere(sWhereString, "(ItmSts = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFItmErr_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFItmErr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ItmErr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFItmErr_Sel)==0) )
      {
         addWhere(sWhereString, "(ItmErr = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY JobId, DocLbl" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AOU3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV10TFDocId ,
                                          int AV11TFDocId_To ,
                                          String AV13TFDocLbl_Sel ,
                                          String AV12TFDocLbl ,
                                          java.util.Date AV14TFItmDtStart ,
                                          java.util.Date AV15TFItmDtEnd ,
                                          String AV19TFItmSts_Sel ,
                                          String AV18TFItmSts ,
                                          String AV17TFItmErr_Sel ,
                                          String AV16TFItmErr ,
                                          int A14470DocId ,
                                          String A14471DocLbl ,
                                          java.util.Date A14481ItmDtStart ,
                                          java.util.Date A14482ItmDtEnd ,
                                          String A14472ItmSts ,
                                          String A14486ItmErr ,
                                          java.util.UUID AV38JobId ,
                                          java.util.UUID A14423JobId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[11];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT JobId, ItmSts, ItmErr, ItmDtEnd, ItmDtStart, DocLbl, DocId, ItmId FROM TEXPLUSNET.TXPJOBITE" ;
      addWhere(sWhereString, "(JobId = ?)");
      if ( ! (0==AV10TFDocId) )
      {
         addWhere(sWhereString, "(DocId >= ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( ! (0==AV11TFDocId_To) )
      {
         addWhere(sWhereString, "(DocId <= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFDocLbl_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFDocLbl)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DocLbl) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFDocLbl_Sel)==0) )
      {
         addWhere(sWhereString, "(DocLbl = ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV14TFItmDtStart) )
      {
         addWhere(sWhereString, "(ItmDtStart >= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV15TFItmDtEnd) )
      {
         addWhere(sWhereString, "(ItmDtEnd >= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFItmSts_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFItmSts)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ItmSts) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFItmSts_Sel)==0) )
      {
         addWhere(sWhereString, "(ItmSts = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFItmErr_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFItmErr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ItmErr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFItmErr_Sel)==0) )
      {
         addWhere(sWhereString, "(ItmErr = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY JobId, ItmSts" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0AOU4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV10TFDocId ,
                                          int AV11TFDocId_To ,
                                          String AV13TFDocLbl_Sel ,
                                          String AV12TFDocLbl ,
                                          java.util.Date AV14TFItmDtStart ,
                                          java.util.Date AV15TFItmDtEnd ,
                                          String AV19TFItmSts_Sel ,
                                          String AV18TFItmSts ,
                                          String AV17TFItmErr_Sel ,
                                          String AV16TFItmErr ,
                                          int A14470DocId ,
                                          String A14471DocLbl ,
                                          java.util.Date A14481ItmDtStart ,
                                          java.util.Date A14482ItmDtEnd ,
                                          String A14472ItmSts ,
                                          String A14486ItmErr ,
                                          java.util.UUID AV38JobId ,
                                          java.util.UUID A14423JobId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[11];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT JobId, ItmErr, ItmSts, ItmDtEnd, ItmDtStart, DocLbl, DocId, ItmId FROM TEXPLUSNET.TXPJOBITE" ;
      addWhere(sWhereString, "(JobId = ?)");
      if ( ! (0==AV10TFDocId) )
      {
         addWhere(sWhereString, "(DocId >= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ! (0==AV11TFDocId_To) )
      {
         addWhere(sWhereString, "(DocId <= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFDocLbl_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFDocLbl)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DocLbl) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFDocLbl_Sel)==0) )
      {
         addWhere(sWhereString, "(DocLbl = ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV14TFItmDtStart) )
      {
         addWhere(sWhereString, "(ItmDtStart >= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV15TFItmDtEnd) )
      {
         addWhere(sWhereString, "(ItmDtEnd >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFItmSts_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFItmSts)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ItmSts) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFItmSts_Sel)==0) )
      {
         addWhere(sWhereString, "(ItmSts = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFItmErr_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFItmErr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ItmErr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFItmErr_Sel)==0) )
      {
         addWhere(sWhereString, "(ItmErr = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY JobId, ItmErr" ;
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
                  return conditional_P0AOU2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.UUID)dynConstraints[16] , (java.util.UUID)dynConstraints[17] );
            case 1 :
                  return conditional_P0AOU3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.UUID)dynConstraints[16] , (java.util.UUID)dynConstraints[17] );
            case 2 :
                  return conditional_P0AOU4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.UUID)dynConstraints[16] , (java.util.UUID)dynConstraints[17] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AOU2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AOU3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AOU4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.UUID[]) buf[0])[0] = rslt.getGUID(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(8);
               return;
            case 1 :
               ((java.util.UUID[]) buf[0])[0] = rslt.getGUID(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(8);
               return;
            case 2 :
               ((java.util.UUID[]) buf[0])[0] = rslt.getGUID(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(8);
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
                  stmt.setGUID(sIdx, (java.util.UUID)parms[11]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[16], false);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[17], false);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setGUID(sIdx, (java.util.UUID)parms[11]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[16], false);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[17], false);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setGUID(sIdx, (java.util.UUID)parms[11]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[16], false);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[17], false);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               return;
      }
   }

}

