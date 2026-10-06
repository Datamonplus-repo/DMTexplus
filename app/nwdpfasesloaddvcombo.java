package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class nwdpfasesloaddvcombo extends GXProcedure
{
   public nwdpfasesloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( nwdpfasesloaddvcombo.class ), "" );
   }

   public nwdpfasesloaddvcombo( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             boolean aP2 ,
                             String aP3 ,
                             int aP4 ,
                             String aP5 ,
                             String aP6 ,
                             String aP7 ,
                             String[] aP8 ,
                             String[] aP9 )
   {
      nwdpfasesloaddvcombo.this.aP10 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        boolean aP2 ,
                        String aP3 ,
                        int aP4 ,
                        String aP5 ,
                        String aP6 ,
                        String aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             boolean aP2 ,
                             String aP3 ,
                             int aP4 ,
                             String aP5 ,
                             String aP6 ,
                             String aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 )
   {
      nwdpfasesloaddvcombo.this.AV16ComboName = aP0;
      nwdpfasesloaddvcombo.this.AV18TrnMode = aP1;
      nwdpfasesloaddvcombo.this.AV20IsDynamicCall = aP2;
      nwdpfasesloaddvcombo.this.AV23EmprCod = aP3;
      nwdpfasesloaddvcombo.this.AV24DisCod = aP4;
      nwdpfasesloaddvcombo.this.AV25ProCod = aP5;
      nwdpfasesloaddvcombo.this.AV29Cond_EmprCod = aP6;
      nwdpfasesloaddvcombo.this.AV11SearchTxt = aP7;
      nwdpfasesloaddvcombo.this.aP8 = aP8;
      nwdpfasesloaddvcombo.this.aP9 = aP9;
      nwdpfasesloaddvcombo.this.aP10 = aP10;
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
      if ( GXutil.strcmp(AV16ComboName, "FasCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_FASCOD' */
         S111 ();
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
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV16ComboName, "DisCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_DISCOD' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV16ComboName, "ProCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PROCOD' */
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
      /* 'LOADCOMBOITEMS_FASCOD' Routine */
      returnInSub = false ;
      if ( AV20IsDynamicCall )
      {
         if ( GXutil.strcmp(AV18TrnMode, "GET_DSC") == 0 )
         {
            AV27ValuesCollection.fromJSonString(AV11SearchTxt, null);
            AV26DscsCollection = new GXSimpleCollection<String>(String.class, "internal", "") ;
            AV33GXV1 = 1 ;
            while ( AV33GXV1 <= AV27ValuesCollection.size() )
            {
               AV28ValueItem = (String)AV27ValuesCollection.elementAt(-1+AV33GXV1) ;
               AV30FasCod_Filter = AV28ValueItem ;
               AV34GXLvl32 = (byte)(0) ;
               /* Using cursor P08U32 */
               pr_default.execute(0, new Object[] {AV29Cond_EmprCod, AV30FasCod_Filter});
               while ( (pr_default.getStatus(0) != 101) )
               {
                  A396EmprCod = P08U32_A396EmprCod[0] ;
                  A457FasCod = P08U32_A457FasCod[0] ;
                  A460FasDsc = P08U32_A460FasDsc[0] ;
                  AV34GXLvl32 = (byte)(1) ;
                  AV26DscsCollection.add(A460FasDsc, 0);
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(0);
               if ( AV34GXLvl32 == 0 )
               {
                  AV26DscsCollection.add("", 0);
               }
               AV33GXV1 = (int)(AV33GXV1+1) ;
            }
            AV12Combo_DataJson = AV26DscsCollection.toJSonString(false) ;
         }
         else
         {
            pr_default.dynParam(1, new Object[]{ new Object[]{
                                                 AV11SearchTxt ,
                                                 A460FasDsc ,
                                                 A396EmprCod ,
                                                 AV29Cond_EmprCod } ,
                                                 new int[]{
                                                 TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                                 }
            });
            lV11SearchTxt = GXutil.concat( GXutil.rtrim( AV11SearchTxt), "%", "") ;
            /* Using cursor P08U33 */
            pr_default.execute(1, new Object[] {AV29Cond_EmprCod, lV11SearchTxt});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A396EmprCod = P08U33_A396EmprCod[0] ;
               A460FasDsc = P08U33_A460FasDsc[0] ;
               A457FasCod = P08U33_A457FasCod[0] ;
               AV14Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
               AV14Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A457FasCod );
               AV14Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A460FasDsc );
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
      /* 'LOADCOMBOITEMS_EMPRCOD' Routine */
      returnInSub = false ;
      if ( AV20IsDynamicCall )
      {
         pr_default.dynParam(2, new Object[]{ new Object[]{
                                              AV11SearchTxt ,
                                              A407EmprNom } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                              }
         });
         lV11SearchTxt = GXutil.concat( GXutil.rtrim( AV11SearchTxt), "%", "") ;
         /* Using cursor P08U34 */
         pr_default.execute(2, new Object[] {lV11SearchTxt});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A407EmprNom = P08U34_A407EmprNom[0] ;
            n407EmprNom = P08U34_n407EmprNom[0] ;
            A396EmprCod = P08U34_A396EmprCod[0] ;
            AV14Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV14Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A396EmprCod );
            AV14Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A407EmprNom );
            AV13Combo_Data.add(AV14Combo_DataItem, 0);
            if ( AV13Combo_Data.size() > AV10MaxItems )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
         AV12Combo_DataJson = AV13Combo_Data.toJSonString(false) ;
      }
      else
      {
         if ( GXutil.strcmp(AV18TrnMode, "INS") != 0 )
         {
            /* Using cursor P08U35 */
            pr_default.execute(3, new Object[] {AV23EmprCod, Integer.valueOf(AV24DisCod), AV25ProCod});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A758ProCod = P08U35_A758ProCod[0] ;
               A361DisCod = P08U35_A361DisCod[0] ;
               A396EmprCod = P08U35_A396EmprCod[0] ;
               A407EmprNom = P08U35_A407EmprNom[0] ;
               n407EmprNom = P08U35_n407EmprNom[0] ;
               A407EmprNom = P08U35_A407EmprNom[0] ;
               n407EmprNom = P08U35_n407EmprNom[0] ;
               AV15SelectedValue = A396EmprCod ;
               AV21SelectedText = A407EmprNom ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(3);
         }
         else
         {
            if ( ! (GXutil.strcmp("", AV23EmprCod)==0) )
            {
               AV15SelectedValue = AV23EmprCod ;
               /* Using cursor P08U36 */
               pr_default.execute(4, new Object[] {AV23EmprCod});
               while ( (pr_default.getStatus(4) != 101) )
               {
                  A396EmprCod = P08U36_A396EmprCod[0] ;
                  A407EmprNom = P08U36_A407EmprNom[0] ;
                  n407EmprNom = P08U36_n407EmprNom[0] ;
                  AV21SelectedText = A407EmprNom ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(4);
            }
         }
      }
   }

   public void S131( )
   {
      /* 'LOADCOMBOITEMS_DISCOD' Routine */
      returnInSub = false ;
      if ( AV20IsDynamicCall )
      {
         pr_default.dynParam(5, new Object[]{ new Object[]{
                                              AV11SearchTxt ,
                                              A365DisDes ,
                                              A396EmprCod ,
                                              AV29Cond_EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV11SearchTxt = GXutil.concat( GXutil.rtrim( AV11SearchTxt), "%", "") ;
         /* Using cursor P08U37 */
         pr_default.execute(5, new Object[] {AV29Cond_EmprCod, lV11SearchTxt});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A396EmprCod = P08U37_A396EmprCod[0] ;
            A365DisDes = P08U37_A365DisDes[0] ;
            A361DisCod = P08U37_A361DisCod[0] ;
            AV14Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV14Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A361DisCod, 8, 0)) );
            AV14Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A365DisDes );
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
      else
      {
         if ( GXutil.strcmp(AV18TrnMode, "INS") != 0 )
         {
            /* Using cursor P08U38 */
            pr_default.execute(6, new Object[] {AV23EmprCod, Integer.valueOf(AV24DisCod), AV25ProCod});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A758ProCod = P08U38_A758ProCod[0] ;
               A361DisCod = P08U38_A361DisCod[0] ;
               A396EmprCod = P08U38_A396EmprCod[0] ;
               A365DisDes = P08U38_A365DisDes[0] ;
               A365DisDes = P08U38_A365DisDes[0] ;
               AV15SelectedValue = ((0==A361DisCod) ? "" : GXutil.trim( GXutil.str( A361DisCod, 8, 0))) ;
               AV21SelectedText = A365DisDes ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(6);
         }
         else
         {
            if ( ! (0==AV24DisCod) )
            {
               AV15SelectedValue = GXutil.trim( GXutil.str( AV24DisCod, 8, 0)) ;
               /* Using cursor P08U39 */
               pr_default.execute(7, new Object[] {AV29Cond_EmprCod, Integer.valueOf(AV24DisCod)});
               while ( (pr_default.getStatus(7) != 101) )
               {
                  A396EmprCod = P08U39_A396EmprCod[0] ;
                  A361DisCod = P08U39_A361DisCod[0] ;
                  A365DisDes = P08U39_A365DisDes[0] ;
                  AV21SelectedText = A365DisDes ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(7);
            }
         }
      }
   }

   public void S141( )
   {
      /* 'LOADCOMBOITEMS_PROCOD' Routine */
      returnInSub = false ;
      if ( AV20IsDynamicCall )
      {
         pr_default.dynParam(8, new Object[]{ new Object[]{
                                              AV11SearchTxt ,
                                              A759ProDsc ,
                                              A396EmprCod ,
                                              AV29Cond_EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV11SearchTxt = GXutil.concat( GXutil.rtrim( AV11SearchTxt), "%", "") ;
         /* Using cursor P08U310 */
         pr_default.execute(8, new Object[] {AV29Cond_EmprCod, lV11SearchTxt});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A396EmprCod = P08U310_A396EmprCod[0] ;
            A759ProDsc = P08U310_A759ProDsc[0] ;
            A758ProCod = P08U310_A758ProCod[0] ;
            AV14Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV14Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A758ProCod );
            AV14Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A759ProDsc );
            AV13Combo_Data.add(AV14Combo_DataItem, 0);
            if ( AV13Combo_Data.size() > AV10MaxItems )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(8);
         }
         pr_default.close(8);
         AV12Combo_DataJson = AV13Combo_Data.toJSonString(false) ;
      }
      else
      {
         if ( GXutil.strcmp(AV18TrnMode, "INS") != 0 )
         {
            /* Using cursor P08U311 */
            pr_default.execute(9, new Object[] {AV23EmprCod, Integer.valueOf(AV24DisCod), AV25ProCod});
            while ( (pr_default.getStatus(9) != 101) )
            {
               A758ProCod = P08U311_A758ProCod[0] ;
               A361DisCod = P08U311_A361DisCod[0] ;
               A396EmprCod = P08U311_A396EmprCod[0] ;
               A759ProDsc = P08U311_A759ProDsc[0] ;
               A759ProDsc = P08U311_A759ProDsc[0] ;
               AV15SelectedValue = A758ProCod ;
               AV21SelectedText = A759ProDsc ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(9);
         }
         else
         {
            if ( ! (GXutil.strcmp("", AV25ProCod)==0) )
            {
               AV15SelectedValue = AV25ProCod ;
               /* Using cursor P08U312 */
               pr_default.execute(10, new Object[] {AV29Cond_EmprCod, AV25ProCod});
               while ( (pr_default.getStatus(10) != 101) )
               {
                  A396EmprCod = P08U312_A396EmprCod[0] ;
                  A758ProCod = P08U312_A758ProCod[0] ;
                  A759ProDsc = P08U312_A759ProDsc[0] ;
                  AV21SelectedText = A759ProDsc ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(10);
            }
         }
      }
   }

   protected void cleanup( )
   {
      this.aP8[0] = nwdpfasesloaddvcombo.this.AV15SelectedValue;
      this.aP9[0] = nwdpfasesloaddvcombo.this.AV21SelectedText;
      this.aP10[0] = nwdpfasesloaddvcombo.this.AV12Combo_DataJson;
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
      A460FasDsc = "" ;
      AV27ValuesCollection = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26DscsCollection = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28ValueItem = "" ;
      AV30FasCod_Filter = "" ;
      scmdbuf = "" ;
      P08U32_A396EmprCod = new String[] {""} ;
      P08U32_A457FasCod = new String[] {""} ;
      P08U32_A460FasDsc = new String[] {""} ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      lV11SearchTxt = "" ;
      P08U33_A396EmprCod = new String[] {""} ;
      P08U33_A460FasDsc = new String[] {""} ;
      P08U33_A457FasCod = new String[] {""} ;
      AV14Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      AV13Combo_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A407EmprNom = "" ;
      P08U34_A407EmprNom = new String[] {""} ;
      P08U34_n407EmprNom = new boolean[] {false} ;
      P08U34_A396EmprCod = new String[] {""} ;
      P08U35_A758ProCod = new String[] {""} ;
      P08U35_A361DisCod = new int[1] ;
      P08U35_A396EmprCod = new String[] {""} ;
      P08U35_A407EmprNom = new String[] {""} ;
      P08U35_n407EmprNom = new boolean[] {false} ;
      A758ProCod = "" ;
      P08U36_A396EmprCod = new String[] {""} ;
      P08U36_A407EmprNom = new String[] {""} ;
      P08U36_n407EmprNom = new boolean[] {false} ;
      A365DisDes = "" ;
      P08U37_A396EmprCod = new String[] {""} ;
      P08U37_A365DisDes = new String[] {""} ;
      P08U37_A361DisCod = new int[1] ;
      P08U38_A758ProCod = new String[] {""} ;
      P08U38_A361DisCod = new int[1] ;
      P08U38_A396EmprCod = new String[] {""} ;
      P08U38_A365DisDes = new String[] {""} ;
      P08U39_A396EmprCod = new String[] {""} ;
      P08U39_A361DisCod = new int[1] ;
      P08U39_A365DisDes = new String[] {""} ;
      A759ProDsc = "" ;
      P08U310_A396EmprCod = new String[] {""} ;
      P08U310_A759ProDsc = new String[] {""} ;
      P08U310_A758ProCod = new String[] {""} ;
      P08U311_A758ProCod = new String[] {""} ;
      P08U311_A361DisCod = new int[1] ;
      P08U311_A396EmprCod = new String[] {""} ;
      P08U311_A759ProDsc = new String[] {""} ;
      P08U312_A396EmprCod = new String[] {""} ;
      P08U312_A758ProCod = new String[] {""} ;
      P08U312_A759ProDsc = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.nwdpfasesloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P08U32_A396EmprCod, P08U32_A457FasCod, P08U32_A460FasDsc
            }
            , new Object[] {
            P08U33_A396EmprCod, P08U33_A460FasDsc, P08U33_A457FasCod
            }
            , new Object[] {
            P08U34_A407EmprNom, P08U34_n407EmprNom, P08U34_A396EmprCod
            }
            , new Object[] {
            P08U35_A758ProCod, P08U35_A361DisCod, P08U35_A396EmprCod, P08U35_A407EmprNom, P08U35_n407EmprNom
            }
            , new Object[] {
            P08U36_A396EmprCod, P08U36_A407EmprNom, P08U36_n407EmprNom
            }
            , new Object[] {
            P08U37_A396EmprCod, P08U37_A365DisDes, P08U37_A361DisCod
            }
            , new Object[] {
            P08U38_A758ProCod, P08U38_A361DisCod, P08U38_A396EmprCod, P08U38_A365DisDes
            }
            , new Object[] {
            P08U39_A396EmprCod, P08U39_A361DisCod, P08U39_A365DisDes
            }
            , new Object[] {
            P08U310_A396EmprCod, P08U310_A759ProDsc, P08U310_A758ProCod
            }
            , new Object[] {
            P08U311_A758ProCod, P08U311_A361DisCod, P08U311_A396EmprCod, P08U311_A759ProDsc
            }
            , new Object[] {
            P08U312_A396EmprCod, P08U312_A758ProCod, P08U312_A759ProDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV34GXLvl32 ;
   private short Gx_err ;
   private int AV24DisCod ;
   private int AV10MaxItems ;
   private int AV33GXV1 ;
   private int A361DisCod ;
   private String AV18TrnMode ;
   private String AV23EmprCod ;
   private String AV25ProCod ;
   private String AV29Cond_EmprCod ;
   private String A460FasDsc ;
   private String AV30FasCod_Filter ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String A407EmprNom ;
   private String A758ProCod ;
   private String A365DisDes ;
   private String A759ProDsc ;
   private boolean AV20IsDynamicCall ;
   private boolean returnInSub ;
   private boolean n407EmprNom ;
   private String AV12Combo_DataJson ;
   private String AV16ComboName ;
   private String AV11SearchTxt ;
   private String AV15SelectedValue ;
   private String AV21SelectedText ;
   private String AV28ValueItem ;
   private String lV11SearchTxt ;
   private String[] aP10 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P08U32_A396EmprCod ;
   private String[] P08U32_A457FasCod ;
   private String[] P08U32_A460FasDsc ;
   private String[] P08U33_A396EmprCod ;
   private String[] P08U33_A460FasDsc ;
   private String[] P08U33_A457FasCod ;
   private String[] P08U34_A407EmprNom ;
   private boolean[] P08U34_n407EmprNom ;
   private String[] P08U34_A396EmprCod ;
   private String[] P08U35_A758ProCod ;
   private int[] P08U35_A361DisCod ;
   private String[] P08U35_A396EmprCod ;
   private String[] P08U35_A407EmprNom ;
   private boolean[] P08U35_n407EmprNom ;
   private String[] P08U36_A396EmprCod ;
   private String[] P08U36_A407EmprNom ;
   private boolean[] P08U36_n407EmprNom ;
   private String[] P08U37_A396EmprCod ;
   private String[] P08U37_A365DisDes ;
   private int[] P08U37_A361DisCod ;
   private String[] P08U38_A758ProCod ;
   private int[] P08U38_A361DisCod ;
   private String[] P08U38_A396EmprCod ;
   private String[] P08U38_A365DisDes ;
   private String[] P08U39_A396EmprCod ;
   private int[] P08U39_A361DisCod ;
   private String[] P08U39_A365DisDes ;
   private String[] P08U310_A396EmprCod ;
   private String[] P08U310_A759ProDsc ;
   private String[] P08U310_A758ProCod ;
   private String[] P08U311_A758ProCod ;
   private int[] P08U311_A361DisCod ;
   private String[] P08U311_A396EmprCod ;
   private String[] P08U311_A759ProDsc ;
   private String[] P08U312_A396EmprCod ;
   private String[] P08U312_A758ProCod ;
   private String[] P08U312_A759ProDsc ;
   private GXSimpleCollection<String> AV27ValuesCollection ;
   private GXSimpleCollection<String> AV26DscsCollection ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV13Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV14Combo_DataItem ;
}

final  class nwdpfasesloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08U33( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV11SearchTxt ,
                                          String A460FasDsc ,
                                          String A396EmprCod ,
                                          String AV29Cond_EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[2];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, FasDsc, FasCod FROM TXPFASPRO" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV11SearchTxt)==0) )
      {
         addWhere(sWhereString, "(FasDsc like '%' || ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY FasDsc" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08U34( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV11SearchTxt ,
                                          String A407EmprNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[1];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprNom, EmprCod FROM TXPEMPRES" ;
      if ( ! (GXutil.strcmp("", AV11SearchTxt)==0) )
      {
         addWhere(sWhereString, "(EmprNom like '%' || ?)");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprNom" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08U37( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV11SearchTxt ,
                                          String A365DisDes ,
                                          String A396EmprCod ,
                                          String AV29Cond_EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[2];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT EmprCod, DisDes, DisCod FROM TXPDISPOS" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV11SearchTxt)==0) )
      {
         addWhere(sWhereString, "(DisDes like '%' || ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY DisDes" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08U310( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV11SearchTxt ,
                                           String A759ProDsc ,
                                           String A396EmprCod ,
                                           String AV29Cond_EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[2];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT EmprCod, ProDsc, ProCod FROM TXPPROCES" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV11SearchTxt)==0) )
      {
         addWhere(sWhereString, "(ProDsc like '%' || ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ProDsc" ;
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
                  return conditional_P08U33(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] );
            case 2 :
                  return conditional_P08U34(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] );
            case 5 :
                  return conditional_P08U37(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] );
            case 8 :
                  return conditional_P08U310(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08U32", "SELECT * FROM (SELECT EmprCod, FasCod, FasDsc FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08U33", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08U34", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08U35", "SELECT T1.ProCod, T1.DisCod, T1.EmprCod, T2.EmprNom FROM (TXPDISLIN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08U36", "SELECT * FROM (SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08U37", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08U38", "SELECT T1.ProCod, T1.DisCod, T1.EmprCod, T2.DisDes FROM (TXPDISLIN T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08U39", "SELECT * FROM (SELECT EmprCod, DisCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08U310", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08U311", "SELECT T1.ProCod, T1.DisCod, T1.EmprCod, T2.ProDsc FROM (TXPDISLIN T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08U312", "SELECT * FROM (SELECT EmprCod, ProCod, ProDsc FROM TXPPROCES WHERE EmprCod = ? and ProCod = ? ORDER BY EmprCod, ProCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 28);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
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
               stmt.setString(2, (String)parms[1], 8);
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
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[1], 40);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
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
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

