package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttrmloaddvcombo extends GXProcedure
{
   public ttrmloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrmloaddvcombo.class ), "" );
   }

   public ttrmloaddvcombo( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> executeUdp( String aP0 ,
                                                                                    String aP1 ,
                                                                                    String aP2 ,
                                                                                    byte aP3 ,
                                                                                    java.util.Date aP4 ,
                                                                                    String[] aP5 )
   {
      ttrmloaddvcombo.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        byte aP3 ,
                        java.util.Date aP4 ,
                        String[] aP5 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             byte aP3 ,
                             java.util.Date aP4 ,
                             String[] aP5 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP6 )
   {
      ttrmloaddvcombo.this.AV12ComboName = aP0;
      ttrmloaddvcombo.this.AV13TrnMode = aP1;
      ttrmloaddvcombo.this.AV14EmprCod = aP2;
      ttrmloaddvcombo.this.AV15TRMDivID = aP3;
      ttrmloaddvcombo.this.AV16TRMFecha = aP4;
      ttrmloaddvcombo.this.aP5 = aP5;
      ttrmloaddvcombo.this.aP6 = aP6;
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
      if ( GXutil.strcmp(AV12ComboName, "TRMDivID") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_TRMDIVID' */
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
      /* 'LOADCOMBOITEMS_TRMDIVID' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09QI2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3099DivCod = P09QI2_A3099DivCod[0] ;
         A3100DivNom = P09QI2_A3100DivNom[0] ;
         n3100DivNom = P09QI2_n3100DivNom[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.str( A3099DivCod, 2, 0) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A3099DivCod, 2, 0)), A3100DivNom, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09QI3 */
         pr_default.execute(1, new Object[] {AV14EmprCod, Byte.valueOf(AV15TRMDivID), AV16TRMFecha});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A14106TRMFecha = P09QI3_A14106TRMFecha[0] ;
            A14105TRMDivID = P09QI3_A14105TRMDivID[0] ;
            A396EmprCod = P09QI3_A396EmprCod[0] ;
            AV17SelectedValue = ((0==A14105TRMDivID) ? "" : GXutil.trim( GXutil.str( A14105TRMDivID, 2, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      else
      {
         if ( ! (0==AV15TRMDivID) )
         {
            AV17SelectedValue = GXutil.trim( GXutil.str( AV15TRMDivID, 2, 0)) ;
         }
      }
   }

   protected void cleanup( )
   {
      this.aP5[0] = ttrmloaddvcombo.this.AV17SelectedValue;
      this.aP6[0] = ttrmloaddvcombo.this.AV10Combo_Data;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17SelectedValue = "" ;
      AV10Combo_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      scmdbuf = "" ;
      P09QI2_A3099DivCod = new byte[1] ;
      P09QI2_A3100DivNom = new String[] {""} ;
      P09QI2_n3100DivNom = new boolean[] {false} ;
      A3100DivNom = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09QI3_A14106TRMFecha = new java.util.Date[] {GXutil.nullDate()} ;
      P09QI3_A14105TRMDivID = new byte[1] ;
      P09QI3_A396EmprCod = new String[] {""} ;
      A14106TRMFecha = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttrmloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09QI2_A3099DivCod, P09QI2_A3100DivNom, P09QI2_n3100DivNom
            }
            , new Object[] {
            P09QI3_A14106TRMFecha, P09QI3_A14105TRMDivID, P09QI3_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15TRMDivID ;
   private byte A3099DivCod ;
   private byte A14105TRMDivID ;
   private short Gx_err ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String scmdbuf ;
   private String A3100DivNom ;
   private String A396EmprCod ;
   private java.util.Date AV16TRMFecha ;
   private java.util.Date A14106TRMFecha ;
   private boolean returnInSub ;
   private boolean n3100DivNom ;
   private String AV12ComboName ;
   private String AV17SelectedValue ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP6 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09QI2_A3099DivCod ;
   private String[] P09QI2_A3100DivNom ;
   private boolean[] P09QI2_n3100DivNom ;
   private java.util.Date[] P09QI3_A14106TRMFecha ;
   private byte[] P09QI3_A14105TRMDivID ;
   private String[] P09QI3_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class ttrmloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09QI2", "SELECT DivCod, DivNom FROM TXPDIVISA ORDER BY DivCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09QI3", "SELECT TRMFecha, TRMDivID, EmprCod FROM TXPTRM WHERE EmprCod = ? and TRMDivID = ? and TRMFecha = ? ORDER BY EmprCod, TRMDivID, TRMFecha ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               return;
      }
   }

}

