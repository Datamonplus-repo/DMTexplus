package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tescandloaddvcombo extends GXProcedure
{
   public tescandloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tescandloaddvcombo.class ), "" );
   }

   public tescandloaddvcombo( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             boolean aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      tescandloaddvcombo.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        boolean aP2 ,
                        String aP3 ,
                        String aP4 ,
                        String aP5 ,
                        String aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             boolean aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 )
   {
      tescandloaddvcombo.this.AV16ComboName = aP0;
      tescandloaddvcombo.this.AV18TrnMode = aP1;
      tescandloaddvcombo.this.AV20IsDynamicCall = aP2;
      tescandloaddvcombo.this.AV23EmprCod = aP3;
      tescandloaddvcombo.this.AV24Workstat = aP4;
      tescandloaddvcombo.this.AV28Cond_EmprCod = aP5;
      tescandloaddvcombo.this.AV11SearchTxt = aP6;
      tescandloaddvcombo.this.aP7 = aP7;
      tescandloaddvcombo.this.aP8 = aP8;
      tescandloaddvcombo.this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      AV10MaxItems = 100 ;
      if ( GXutil.strcmp(AV16ComboName, "PrdNum") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PRDNUM' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV16ComboName, "ProForCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PROFORCOD' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV16ComboName, "ForPrdUMe") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_FORPRDUME' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV16ComboName, "EmprCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_EMPRCOD' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADCOMBOITEMS_PRDNUM' Routine */
      returnInSub = false ;
      if ( AV20IsDynamicCall )
      {
         if ( GXutil.strcmp(AV18TrnMode, "GET_DSC") == 0 )
         {
            AV26ValuesCollection.fromJSonString(AV11SearchTxt, null);
            AV25DscsCollection = new GXSimpleCollection<String>(String.class, "internal", "") ;
            AV34GXV1 = 1 ;
            while ( AV34GXV1 <= AV26ValuesCollection.size() )
            {
               AV27ValueItem = (String)AV26ValuesCollection.elementAt(-1+AV34GXV1) ;
               AV29PrdNum_Filter = AV27ValueItem ;
               AV35GXLvl32 = (byte)(0) ;
               /* Using cursor P08UJ2 */
               pr_default.execute(0, new Object[] {AV28Cond_EmprCod, AV29PrdNum_Filter});
               while ( (pr_default.getStatus(0) != 101) )
               {
                  A396EmprCod = P08UJ2_A396EmprCod[0] ;
                  A719PrdNum = P08UJ2_A719PrdNum[0] ;
                  A718PrdNom = P08UJ2_A718PrdNom[0] ;
                  AV35GXLvl32 = (byte)(1) ;
                  AV25DscsCollection.add(A718PrdNom, 0);
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(0);
               if ( AV35GXLvl32 == 0 )
               {
                  AV25DscsCollection.add("", 0);
               }
               AV34GXV1 = (int)(AV34GXV1+1) ;
            }
            AV12Combo_DataJson = AV25DscsCollection.toJSonString(false) ;
         }
         else
         {
            pr_default.dynParam(1, new Object[]{ new Object[]{
                                                 AV11SearchTxt ,
                                                 A718PrdNom ,
                                                 AV28Cond_EmprCod ,
                                                 A396EmprCod } ,
                                                 new int[]{
                                                 TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                                 }
            });
            lV11SearchTxt = GXutil.concat( GXutil.rtrim( AV11SearchTxt), "%", "") ;
            /* Using cursor P08UJ3 */
            pr_default.execute(1, new Object[] {AV28Cond_EmprCod, lV11SearchTxt});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A718PrdNom = P08UJ3_A718PrdNom[0] ;
               A396EmprCod = P08UJ3_A396EmprCod[0] ;
               A719PrdNum = P08UJ3_A719PrdNum[0] ;
               AV14Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
               AV14Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A719PrdNum );
               AV14Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A718PrdNom );
               AV13Combo_Data.add(AV14Combo_DataItem, 0);
               if ( AV13Combo_Data.size() > AV10MaxItems )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               pr_default.readNext(1);
            }
            pr_default.close(1);
            AV12Combo_DataJson = AV13Combo_Data.toJSonString(false) ;
         }
      }
      else
      {
      }
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_PROFORCOD' Routine */
      returnInSub = false ;
      if ( AV20IsDynamicCall )
      {
         if ( GXutil.strcmp(AV18TrnMode, "GET_DSC") == 0 )
         {
            AV26ValuesCollection.fromJSonString(AV11SearchTxt, null);
            AV25DscsCollection = new GXSimpleCollection<String>(String.class, "internal", "") ;
            AV37GXV2 = 1 ;
            while ( AV37GXV2 <= AV26ValuesCollection.size() )
            {
               AV27ValueItem = (String)AV26ValuesCollection.elementAt(-1+AV37GXV2) ;
               AV30ProForCod_Filter = AV27ValueItem ;
               AV38GXLvl74 = (byte)(0) ;
               /* Using cursor P08UJ4 */
               pr_default.execute(2, new Object[] {AV28Cond_EmprCod, AV30ProForCod_Filter});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A396EmprCod = P08UJ4_A396EmprCod[0] ;
                  A764ProForCod = P08UJ4_A764ProForCod[0] ;
                  A766ProForDsc = P08UJ4_A766ProForDsc[0] ;
                  AV38GXLvl74 = (byte)(1) ;
                  AV25DscsCollection.add(A766ProForDsc, 0);
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(2);
               if ( AV38GXLvl74 == 0 )
               {
                  AV25DscsCollection.add("", 0);
               }
               AV37GXV2 = (int)(AV37GXV2+1) ;
            }
            AV12Combo_DataJson = AV25DscsCollection.toJSonString(false) ;
         }
         else
         {
            pr_default.dynParam(3, new Object[]{ new Object[]{
                                                 AV11SearchTxt ,
                                                 A766ProForDsc ,
                                                 A396EmprCod ,
                                                 AV28Cond_EmprCod } ,
                                                 new int[]{
                                                 TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                                 }
            });
            lV11SearchTxt = GXutil.concat( GXutil.rtrim( AV11SearchTxt), "%", "") ;
            /* Using cursor P08UJ5 */
            pr_default.execute(3, new Object[] {AV28Cond_EmprCod, lV11SearchTxt});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A396EmprCod = P08UJ5_A396EmprCod[0] ;
               A766ProForDsc = P08UJ5_A766ProForDsc[0] ;
               A764ProForCod = P08UJ5_A764ProForCod[0] ;
               AV14Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
               AV14Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A764ProForCod );
               AV14Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A766ProForDsc );
               AV13Combo_Data.add(AV14Combo_DataItem, 0);
               if ( AV13Combo_Data.size() > AV10MaxItems )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               pr_default.readNext(3);
            }
            pr_default.close(3);
            AV12Combo_DataJson = AV13Combo_Data.toJSonString(false) ;
         }
      }
      else
      {
      }
   }

   public void S131( )
   {
      /* 'LOADCOMBOITEMS_FORPRDUME' Routine */
      returnInSub = false ;
      if ( AV20IsDynamicCall )
      {
         if ( GXutil.strcmp(AV18TrnMode, "GET_DSC") == 0 )
         {
            AV26ValuesCollection.fromJSonString(AV11SearchTxt, null);
            AV25DscsCollection = new GXSimpleCollection<String>(String.class, "internal", "") ;
            AV40GXV3 = 1 ;
            while ( AV40GXV3 <= AV26ValuesCollection.size() )
            {
               AV27ValueItem = (String)AV26ValuesCollection.elementAt(-1+AV40GXV3) ;
               AV31ForPrdUMe_Filter = (byte)(GXutil.lval( AV27ValueItem)) ;
               AV41GXLvl116 = (byte)(0) ;
               /* Using cursor P08UJ6 */
               pr_default.execute(4, new Object[] {AV28Cond_EmprCod, Byte.valueOf(AV31ForPrdUMe_Filter)});
               while ( (pr_default.getStatus(4) != 101) )
               {
                  A396EmprCod = P08UJ6_A396EmprCod[0] ;
                  A490ForPrdUMe = P08UJ6_A490ForPrdUMe[0] ;
                  A488ForPrdDsc = P08UJ6_A488ForPrdDsc[0] ;
                  n488ForPrdDsc = P08UJ6_n488ForPrdDsc[0] ;
                  AV41GXLvl116 = (byte)(1) ;
                  AV25DscsCollection.add(A488ForPrdDsc, 0);
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(4);
               if ( AV41GXLvl116 == 0 )
               {
                  AV25DscsCollection.add("", 0);
               }
               AV40GXV3 = (int)(AV40GXV3+1) ;
            }
            AV12Combo_DataJson = AV25DscsCollection.toJSonString(false) ;
         }
         else
         {
            pr_default.dynParam(5, new Object[]{ new Object[]{
                                                 AV11SearchTxt ,
                                                 A488ForPrdDsc ,
                                                 A396EmprCod ,
                                                 AV28Cond_EmprCod } ,
                                                 new int[]{
                                                 TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                                 }
            });
            lV11SearchTxt = GXutil.concat( GXutil.rtrim( AV11SearchTxt), "%", "") ;
            /* Using cursor P08UJ7 */
            pr_default.execute(5, new Object[] {AV28Cond_EmprCod, lV11SearchTxt});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A396EmprCod = P08UJ7_A396EmprCod[0] ;
               A488ForPrdDsc = P08UJ7_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P08UJ7_n488ForPrdDsc[0] ;
               A490ForPrdUMe = P08UJ7_A490ForPrdUMe[0] ;
               AV14Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
               AV14Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A490ForPrdUMe, 1, 0)) );
               AV14Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A488ForPrdDsc );
               AV13Combo_Data.add(AV14Combo_DataItem, 0);
               if ( AV13Combo_Data.size() > AV10MaxItems )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               pr_default.readNext(5);
            }
            pr_default.close(5);
            AV12Combo_DataJson = AV13Combo_Data.toJSonString(false) ;
         }
      }
      else
      {
      }
   }

   public void S141( )
   {
      /* 'LOADCOMBOITEMS_EMPRCOD' Routine */
      returnInSub = false ;
      if ( AV20IsDynamicCall )
      {
         pr_default.dynParam(6, new Object[]{ new Object[]{
                                              AV11SearchTxt ,
                                              A407EmprNom } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                              }
         });
         lV11SearchTxt = GXutil.concat( GXutil.rtrim( AV11SearchTxt), "%", "") ;
         /* Using cursor P08UJ8 */
         pr_default.execute(6, new Object[] {lV11SearchTxt});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A407EmprNom = P08UJ8_A407EmprNom[0] ;
            n407EmprNom = P08UJ8_n407EmprNom[0] ;
            A396EmprCod = P08UJ8_A396EmprCod[0] ;
            AV14Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV14Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A396EmprCod );
            AV14Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A407EmprNom );
            AV13Combo_Data.add(AV14Combo_DataItem, 0);
            if ( AV13Combo_Data.size() > AV10MaxItems )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(6);
         }
         pr_default.close(6);
         AV12Combo_DataJson = AV13Combo_Data.toJSonString(false) ;
      }
      else
      {
         if ( GXutil.strcmp(AV18TrnMode, "INS") != 0 )
         {
            /* Using cursor P08UJ9 */
            pr_default.execute(7, new Object[] {AV23EmprCod, AV24Workstat});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A910Workstat = P08UJ9_A910Workstat[0] ;
               A396EmprCod = P08UJ9_A396EmprCod[0] ;
               A407EmprNom = P08UJ9_A407EmprNom[0] ;
               n407EmprNom = P08UJ9_n407EmprNom[0] ;
               A407EmprNom = P08UJ9_A407EmprNom[0] ;
               n407EmprNom = P08UJ9_n407EmprNom[0] ;
               AV15SelectedValue = A396EmprCod ;
               AV21SelectedText = A407EmprNom ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(7);
         }
         else
         {
            if ( ! (GXutil.strcmp("", AV23EmprCod)==0) )
            {
               AV15SelectedValue = AV23EmprCod ;
               /* Using cursor P08UJ10 */
               pr_default.execute(8, new Object[] {AV23EmprCod});
               while ( (pr_default.getStatus(8) != 101) )
               {
                  A396EmprCod = P08UJ10_A396EmprCod[0] ;
                  A407EmprNom = P08UJ10_A407EmprNom[0] ;
                  n407EmprNom = P08UJ10_n407EmprNom[0] ;
                  AV21SelectedText = A407EmprNom ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(8);
            }
         }
      }
   }

   protected void cleanup( )
   {
      this.aP7[0] = tescandloaddvcombo.this.AV15SelectedValue;
      this.aP8[0] = tescandloaddvcombo.this.AV21SelectedText;
      this.aP9[0] = tescandloaddvcombo.this.AV12Combo_DataJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15SelectedValue = "" ;
      AV21SelectedText = "" ;
      AV12Combo_DataJson = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      A718PrdNom = "" ;
      AV26ValuesCollection = new GXSimpleCollection<String>(String.class, "internal", "");
      AV25DscsCollection = new GXSimpleCollection<String>(String.class, "internal", "");
      AV27ValueItem = "" ;
      AV29PrdNum_Filter = "" ;
      scmdbuf = "" ;
      P08UJ2_A396EmprCod = new String[] {""} ;
      P08UJ2_A719PrdNum = new String[] {""} ;
      P08UJ2_A718PrdNom = new String[] {""} ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      lV11SearchTxt = "" ;
      P08UJ3_A718PrdNom = new String[] {""} ;
      P08UJ3_A396EmprCod = new String[] {""} ;
      P08UJ3_A719PrdNum = new String[] {""} ;
      AV14Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      AV13Combo_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A766ProForDsc = "" ;
      AV30ProForCod_Filter = "" ;
      P08UJ4_A396EmprCod = new String[] {""} ;
      P08UJ4_A764ProForCod = new String[] {""} ;
      P08UJ4_A766ProForDsc = new String[] {""} ;
      A764ProForCod = "" ;
      P08UJ5_A396EmprCod = new String[] {""} ;
      P08UJ5_A766ProForDsc = new String[] {""} ;
      P08UJ5_A764ProForCod = new String[] {""} ;
      A488ForPrdDsc = "" ;
      P08UJ6_A396EmprCod = new String[] {""} ;
      P08UJ6_A490ForPrdUMe = new byte[1] ;
      P08UJ6_A488ForPrdDsc = new String[] {""} ;
      P08UJ6_n488ForPrdDsc = new boolean[] {false} ;
      P08UJ7_A396EmprCod = new String[] {""} ;
      P08UJ7_A488ForPrdDsc = new String[] {""} ;
      P08UJ7_n488ForPrdDsc = new boolean[] {false} ;
      P08UJ7_A490ForPrdUMe = new byte[1] ;
      A407EmprNom = "" ;
      P08UJ8_A407EmprNom = new String[] {""} ;
      P08UJ8_n407EmprNom = new boolean[] {false} ;
      P08UJ8_A396EmprCod = new String[] {""} ;
      P08UJ9_A910Workstat = new String[] {""} ;
      P08UJ9_A396EmprCod = new String[] {""} ;
      P08UJ9_A407EmprNom = new String[] {""} ;
      P08UJ9_n407EmprNom = new boolean[] {false} ;
      A910Workstat = "" ;
      P08UJ10_A396EmprCod = new String[] {""} ;
      P08UJ10_A407EmprNom = new String[] {""} ;
      P08UJ10_n407EmprNom = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.tescandloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P08UJ2_A396EmprCod, P08UJ2_A719PrdNum, P08UJ2_A718PrdNom
            }
            , new Object[] {
            P08UJ3_A718PrdNom, P08UJ3_A396EmprCod, P08UJ3_A719PrdNum
            }
            , new Object[] {
            P08UJ4_A396EmprCod, P08UJ4_A764ProForCod, P08UJ4_A766ProForDsc
            }
            , new Object[] {
            P08UJ5_A396EmprCod, P08UJ5_A766ProForDsc, P08UJ5_A764ProForCod
            }
            , new Object[] {
            P08UJ6_A396EmprCod, P08UJ6_A490ForPrdUMe, P08UJ6_A488ForPrdDsc, P08UJ6_n488ForPrdDsc
            }
            , new Object[] {
            P08UJ7_A396EmprCod, P08UJ7_A488ForPrdDsc, P08UJ7_n488ForPrdDsc, P08UJ7_A490ForPrdUMe
            }
            , new Object[] {
            P08UJ8_A407EmprNom, P08UJ8_n407EmprNom, P08UJ8_A396EmprCod
            }
            , new Object[] {
            P08UJ9_A910Workstat, P08UJ9_A396EmprCod, P08UJ9_A407EmprNom, P08UJ9_n407EmprNom
            }
            , new Object[] {
            P08UJ10_A396EmprCod, P08UJ10_A407EmprNom, P08UJ10_n407EmprNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV35GXLvl32 ;
   private byte AV38GXLvl74 ;
   private byte AV31ForPrdUMe_Filter ;
   private byte AV41GXLvl116 ;
   private byte A490ForPrdUMe ;
   private short Gx_err ;
   private int AV10MaxItems ;
   private int AV34GXV1 ;
   private int AV37GXV2 ;
   private int AV40GXV3 ;
   private String AV18TrnMode ;
   private String AV23EmprCod ;
   private String AV24Workstat ;
   private String AV28Cond_EmprCod ;
   private String A718PrdNom ;
   private String AV29PrdNum_Filter ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A766ProForDsc ;
   private String AV30ProForCod_Filter ;
   private String A764ProForCod ;
   private String A488ForPrdDsc ;
   private String A407EmprNom ;
   private String A910Workstat ;
   private boolean AV20IsDynamicCall ;
   private boolean returnInSub ;
   private boolean n488ForPrdDsc ;
   private boolean n407EmprNom ;
   private String AV12Combo_DataJson ;
   private String AV16ComboName ;
   private String AV11SearchTxt ;
   private String AV15SelectedValue ;
   private String AV21SelectedText ;
   private String AV27ValueItem ;
   private String lV11SearchTxt ;
   private String[] aP9 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P08UJ2_A396EmprCod ;
   private String[] P08UJ2_A719PrdNum ;
   private String[] P08UJ2_A718PrdNom ;
   private String[] P08UJ3_A718PrdNom ;
   private String[] P08UJ3_A396EmprCod ;
   private String[] P08UJ3_A719PrdNum ;
   private String[] P08UJ4_A396EmprCod ;
   private String[] P08UJ4_A764ProForCod ;
   private String[] P08UJ4_A766ProForDsc ;
   private String[] P08UJ5_A396EmprCod ;
   private String[] P08UJ5_A766ProForDsc ;
   private String[] P08UJ5_A764ProForCod ;
   private String[] P08UJ6_A396EmprCod ;
   private byte[] P08UJ6_A490ForPrdUMe ;
   private String[] P08UJ6_A488ForPrdDsc ;
   private boolean[] P08UJ6_n488ForPrdDsc ;
   private String[] P08UJ7_A396EmprCod ;
   private String[] P08UJ7_A488ForPrdDsc ;
   private boolean[] P08UJ7_n488ForPrdDsc ;
   private byte[] P08UJ7_A490ForPrdUMe ;
   private String[] P08UJ8_A407EmprNom ;
   private boolean[] P08UJ8_n407EmprNom ;
   private String[] P08UJ8_A396EmprCod ;
   private String[] P08UJ9_A910Workstat ;
   private String[] P08UJ9_A396EmprCod ;
   private String[] P08UJ9_A407EmprNom ;
   private boolean[] P08UJ9_n407EmprNom ;
   private String[] P08UJ10_A396EmprCod ;
   private String[] P08UJ10_A407EmprNom ;
   private boolean[] P08UJ10_n407EmprNom ;
   private GXSimpleCollection<String> AV26ValuesCollection ;
   private GXSimpleCollection<String> AV25DscsCollection ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV13Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV14Combo_DataItem ;
}

final  class tescandloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08UJ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV11SearchTxt ,
                                          String A718PrdNom ,
                                          String AV28Cond_EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[2];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT PrdNom, EmprCod, PrdNum FROM TXPPRODUC" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV11SearchTxt)==0) )
      {
         addWhere(sWhereString, "(PrdNom like '%' || ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, PrdNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08UJ5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV11SearchTxt ,
                                          String A766ProForDsc ,
                                          String A396EmprCod ,
                                          String AV28Cond_EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[2];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, ProForDsc, ProForCod FROM TXPCPROFO" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV11SearchTxt)==0) )
      {
         addWhere(sWhereString, "(ProForDsc like '%' || ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ProForDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08UJ7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV11SearchTxt ,
                                          String A488ForPrdDsc ,
                                          String A396EmprCod ,
                                          String AV28Cond_EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[2];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT EmprCod, ForPrdDsc, ForPrdUMe FROM TXPUNMEPR" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV11SearchTxt)==0) )
      {
         addWhere(sWhereString, "(ForPrdDsc like '%' || ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ForPrdDsc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08UJ8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV11SearchTxt ,
                                          String A407EmprNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[1];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT EmprNom, EmprCod FROM TXPEMPRES" ;
      if ( ! (GXutil.strcmp("", AV11SearchTxt)==0) )
      {
         addWhere(sWhereString, "(EmprNom like '%' || ?)");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprNom" ;
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
            case 1 :
                  return conditional_P08UJ3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] );
            case 3 :
                  return conditional_P08UJ5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] );
            case 5 :
                  return conditional_P08UJ7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] );
            case 6 :
                  return conditional_P08UJ8(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08UJ2", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdNom FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08UJ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08UJ4", "SELECT * FROM (SELECT EmprCod, ProForCod, ProForDsc FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08UJ5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08UJ6", "SELECT * FROM (SELECT EmprCod, ForPrdUMe, ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? and ForPrdUMe = ? ORDER BY EmprCod, ForPrdUMe) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08UJ7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08UJ8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08UJ9", "SELECT T1.Workstat, T1.EmprCod, T2.EmprNom FROM (TXPCESCAN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.EmprCod = ? and T1.Workstat = ? ORDER BY T1.EmprCod, T1.Workstat ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08UJ10", "SELECT * FROM (SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 5);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[2], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[3], 40);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[2], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[3], 40);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[2], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[3], 40);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[1], 40);
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

