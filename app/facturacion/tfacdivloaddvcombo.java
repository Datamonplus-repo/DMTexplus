package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tfacdivloaddvcombo extends GXProcedure
{
   public tfacdivloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tfacdivloaddvcombo.class ), "" );
   }

   public tfacdivloaddvcombo( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> executeUdp( String aP0 ,
                                                                                    String aP1 ,
                                                                                    String aP2 ,
                                                                                    int aP3 ,
                                                                                    String[] aP4 )
   {
      tfacdivloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        int aP3 ,
                        String[] aP4 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             int aP3 ,
                             String[] aP4 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 )
   {
      tfacdivloaddvcombo.this.AV12ComboName = aP0;
      tfacdivloaddvcombo.this.AV13TrnMode = aP1;
      tfacdivloaddvcombo.this.AV14EmprCod = aP2;
      tfacdivloaddvcombo.this.AV15FacCod = aP3;
      tfacdivloaddvcombo.this.aP4 = aP4;
      tfacdivloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV12ComboName, "FacRepCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_FACREPCOD' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "FacDivCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_FACDIVCOD' */
         S121 ();
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
      /* 'LOADCOMBOITEMS_FACREPCOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P0AVT2 */
      pr_default.execute(0, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0AVT2_A396EmprCod[0] ;
         A3074RepNom = P0AVT2_A3074RepNom[0] ;
         n3074RepNom = P0AVT2_n3074RepNom[0] ;
         A3073RepCod = P0AVT2_A3073RepCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A3073RepCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.rtrim( localUtil.format( A3073RepCod, ""))+"-"+GXutil.trim( A3074RepNom) );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0AVT3 */
         pr_default.execute(1, new Object[] {AV14EmprCod, Integer.valueOf(AV15FacCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A430FacCod = P0AVT3_A430FacCod[0] ;
            A396EmprCod = P0AVT3_A396EmprCod[0] ;
            A3119FacRepCod = P0AVT3_A3119FacRepCod[0] ;
            n3119FacRepCod = P0AVT3_n3119FacRepCod[0] ;
            AV16SelectedValue = A3119FacRepCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_FACDIVCOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P0AVT4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A3101DivAbr = P0AVT4_A3101DivAbr[0] ;
         n3101DivAbr = P0AVT4_n3101DivAbr[0] ;
         A3099DivCod = P0AVT4_A3099DivCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A3099DivCod, 2, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.trim( GXutil.str( A3099DivCod, 2, 0))+"-"+GXutil.trim( A3101DivAbr) );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0AVT5 */
         pr_default.execute(3, new Object[] {AV14EmprCod, Integer.valueOf(AV15FacCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A430FacCod = P0AVT5_A430FacCod[0] ;
            A396EmprCod = P0AVT5_A396EmprCod[0] ;
            A3115FacDivCod = P0AVT5_A3115FacDivCod[0] ;
            n3115FacDivCod = P0AVT5_n3115FacDivCod[0] ;
            AV16SelectedValue = ((0==A3115FacDivCod) ? "" : GXutil.trim( GXutil.str( A3115FacDivCod, 2, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = tfacdivloaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = tfacdivloaddvcombo.this.AV10Combo_Data;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16SelectedValue = "" ;
      AV10Combo_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      scmdbuf = "" ;
      P0AVT2_A396EmprCod = new String[] {""} ;
      P0AVT2_A3074RepNom = new String[] {""} ;
      P0AVT2_n3074RepNom = new boolean[] {false} ;
      P0AVT2_A3073RepCod = new String[] {""} ;
      A396EmprCod = "" ;
      A3074RepNom = "" ;
      A3073RepCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P0AVT3_A430FacCod = new int[1] ;
      P0AVT3_A396EmprCod = new String[] {""} ;
      P0AVT3_A3119FacRepCod = new String[] {""} ;
      P0AVT3_n3119FacRepCod = new boolean[] {false} ;
      A3119FacRepCod = "" ;
      P0AVT4_A3101DivAbr = new String[] {""} ;
      P0AVT4_n3101DivAbr = new boolean[] {false} ;
      P0AVT4_A3099DivCod = new byte[1] ;
      A3101DivAbr = "" ;
      P0AVT5_A430FacCod = new int[1] ;
      P0AVT5_A396EmprCod = new String[] {""} ;
      P0AVT5_A3115FacDivCod = new byte[1] ;
      P0AVT5_n3115FacDivCod = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tfacdivloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0AVT2_A396EmprCod, P0AVT2_A3074RepNom, P0AVT2_n3074RepNom, P0AVT2_A3073RepCod
            }
            , new Object[] {
            P0AVT3_A430FacCod, P0AVT3_A396EmprCod, P0AVT3_A3119FacRepCod, P0AVT3_n3119FacRepCod
            }
            , new Object[] {
            P0AVT4_A3101DivAbr, P0AVT4_n3101DivAbr, P0AVT4_A3099DivCod
            }
            , new Object[] {
            P0AVT5_A430FacCod, P0AVT5_A396EmprCod, P0AVT5_A3115FacDivCod, P0AVT5_n3115FacDivCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A3099DivCod ;
   private byte A3115FacDivCod ;
   private short Gx_err ;
   private int AV15FacCod ;
   private int A430FacCod ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A3074RepNom ;
   private String A3073RepCod ;
   private String A3119FacRepCod ;
   private String A3101DivAbr ;
   private boolean returnInSub ;
   private boolean n3074RepNom ;
   private boolean n3119FacRepCod ;
   private boolean n3101DivAbr ;
   private boolean n3115FacDivCod ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AVT2_A396EmprCod ;
   private String[] P0AVT2_A3074RepNom ;
   private boolean[] P0AVT2_n3074RepNom ;
   private String[] P0AVT2_A3073RepCod ;
   private int[] P0AVT3_A430FacCod ;
   private String[] P0AVT3_A396EmprCod ;
   private String[] P0AVT3_A3119FacRepCod ;
   private boolean[] P0AVT3_n3119FacRepCod ;
   private String[] P0AVT4_A3101DivAbr ;
   private boolean[] P0AVT4_n3101DivAbr ;
   private byte[] P0AVT4_A3099DivCod ;
   private int[] P0AVT5_A430FacCod ;
   private String[] P0AVT5_A396EmprCod ;
   private byte[] P0AVT5_A3115FacDivCod ;
   private boolean[] P0AVT5_n3115FacDivCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class tfacdivloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AVT2", "SELECT EmprCod, RepNom, RepCod FROM TXPREPRES WHERE EmprCod = ? ORDER BY EmprCod, RepCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AVT3", "SELECT FacCod, EmprCod, FacRepCod FROM TXPCFAVEN WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AVT4", "SELECT DivAbr, DivCod FROM TXPDIVISA ORDER BY DivCod, DivAbr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AVT5", "SELECT FacCod, EmprCod, FacDivCod FROM TXPCFAVEN WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 34);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

