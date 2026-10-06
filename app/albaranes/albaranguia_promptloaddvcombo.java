package app.albaranes ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class albaranguia_promptloaddvcombo extends GXProcedure
{
   public albaranguia_promptloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( albaranguia_promptloaddvcombo.class ), "" );
   }

   public albaranguia_promptloaddvcombo( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 )
   {
      albaranguia_promptloaddvcombo.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 )
   {
      albaranguia_promptloaddvcombo.this.AV14ComboName = aP0;
      albaranguia_promptloaddvcombo.this.AV15TrnMode = aP1;
      albaranguia_promptloaddvcombo.this.AV11SearchTxt = aP2;
      albaranguia_promptloaddvcombo.this.aP3 = aP3;
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
      if ( GXutil.strcmp(AV14ComboName, "CliCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_CLICOD' */
         S111 ();
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
      /* 'LOADCOMBOITEMS_CLICOD' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV15TrnMode, "GET_DSC") != 0 )
      {
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV11SearchTxt ,
                                              A279CliNom } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV11SearchTxt = GXutil.concat( GXutil.rtrim( AV11SearchTxt), "%", "") ;
         /* Using cursor P09PV2 */
         pr_default.execute(0, new Object[] {lV11SearchTxt});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A279CliNom = P09PV2_A279CliNom[0] ;
            A252CliCod = P09PV2_A252CliCod[0] ;
            AV13Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV13Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
            AV13Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A252CliCod, 6, 0)), A279CliNom, "", "", "", "", "", "", "") );
            AV12Combo_Data.add(AV13Combo_DataItem, 0);
            if ( AV12Combo_Data.size() > AV10MaxItems )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         AV16Combo_DataJson = AV12Combo_Data.toJSonString(false) ;
      }
      else
      {
         AV18CliCodKey = (int)(GXutil.lval( AV11SearchTxt)) ;
         /* Using cursor P09PV3 */
         pr_default.execute(1, new Object[] {Integer.valueOf(AV18CliCodKey)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A252CliCod = P09PV3_A252CliCod[0] ;
            A279CliNom = P09PV3_A279CliNom[0] ;
            A396EmprCod = P09PV3_A396EmprCod[0] ;
            AV20CliCodDescription = A279CliNom ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      if ( GXutil.strcmp(AV15TrnMode, "GET_DSC") != 0 )
      {
         AV12Combo_Data.sort("Title");
         AV16Combo_DataJson = AV12Combo_Data.toJSonString(false) ;
      }
      else
      {
         AV16Combo_DataJson = AV20CliCodDescription ;
      }
   }

   protected void cleanup( )
   {
      this.aP3[0] = albaranguia_promptloaddvcombo.this.AV16Combo_DataJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16Combo_DataJson = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      scmdbuf = "" ;
      lV11SearchTxt = "" ;
      A279CliNom = "" ;
      P09PV2_A279CliNom = new String[] {""} ;
      P09PV2_A252CliCod = new int[1] ;
      AV13Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      AV12Combo_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      P09PV3_A252CliCod = new int[1] ;
      P09PV3_A279CliNom = new String[] {""} ;
      P09PV3_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV20CliCodDescription = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaranguia_promptloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09PV2_A279CliNom, P09PV2_A252CliCod
            }
            , new Object[] {
            P09PV3_A252CliCod, P09PV3_A279CliNom, P09PV3_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV10MaxItems ;
   private int A252CliCod ;
   private int AV18CliCodKey ;
   private String AV15TrnMode ;
   private String scmdbuf ;
   private String A279CliNom ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private String AV16Combo_DataJson ;
   private String AV14ComboName ;
   private String AV11SearchTxt ;
   private String lV11SearchTxt ;
   private String AV20CliCodDescription ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P09PV2_A279CliNom ;
   private int[] P09PV2_A252CliCod ;
   private int[] P09PV3_A252CliCod ;
   private String[] P09PV3_A279CliNom ;
   private String[] P09PV3_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV12Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV13Combo_DataItem ;
}

final  class albaranguia_promptloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09PV2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV11SearchTxt ,
                                          String A279CliNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[1];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT DISTINCT CliNom, CliCod FROM TXPCLIENT" ;
      if ( ! (GXutil.strcmp("", AV11SearchTxt)==0) )
      {
         addWhere(sWhereString, "(UPPER(CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
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
                  return conditional_P09PV2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09PV2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09PV3", "SELECT * FROM (SELECT CliCod, CliNom, EmprCod FROM TXPCLIENT WHERE CliCod = ? ORDER BY EmprCod, CliCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[1], 40);
               }
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

