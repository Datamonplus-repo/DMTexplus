package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmordmcloaddvcombo extends GXProcedure
{
   public tmordmcloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmordmcloaddvcombo.class ), "" );
   }

   public tmordmcloaddvcombo( int remoteHandle ,
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
      tmordmcloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      tmordmcloaddvcombo.this.AV12ComboName = aP0;
      tmordmcloaddvcombo.this.AV13TrnMode = aP1;
      tmordmcloaddvcombo.this.AV14EmprCod = aP2;
      tmordmcloaddvcombo.this.AV15OMCod = aP3;
      tmordmcloaddvcombo.this.aP4 = aP4;
      tmordmcloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV12ComboName, "OMOpeCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_OMOPECOD' */
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
      /* 'LOADCOMBOITEMS_OMOPECOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P0AR62 */
      pr_default.execute(0, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8482OpeAct = P0AR62_A8482OpeAct[0] ;
         n8482OpeAct = P0AR62_n8482OpeAct[0] ;
         A396EmprCod = P0AR62_A396EmprCod[0] ;
         A653OpeNom = P0AR62_A653OpeNom[0] ;
         n653OpeNom = P0AR62_n653OpeNom[0] ;
         A652OpeCod = P0AR62_A652OpeCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A652OpeCod, 6, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9"))+"-"+GXutil.trim( A653OpeNom) );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV10Combo_Data.sort("Title");
   }

   protected void cleanup( )
   {
      this.aP4[0] = tmordmcloaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = tmordmcloaddvcombo.this.AV10Combo_Data;
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
      P0AR62_A8482OpeAct = new String[] {""} ;
      P0AR62_n8482OpeAct = new boolean[] {false} ;
      P0AR62_A396EmprCod = new String[] {""} ;
      P0AR62_A653OpeNom = new String[] {""} ;
      P0AR62_n653OpeNom = new boolean[] {false} ;
      P0AR62_A652OpeCod = new int[1] ;
      A8482OpeAct = "" ;
      A396EmprCod = "" ;
      A653OpeNom = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmordmcloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0AR62_A8482OpeAct, P0AR62_n8482OpeAct, P0AR62_A396EmprCod, P0AR62_A653OpeNom, P0AR62_n653OpeNom, P0AR62_A652OpeCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV15OMCod ;
   private int A652OpeCod ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String scmdbuf ;
   private String A8482OpeAct ;
   private String A396EmprCod ;
   private String A653OpeNom ;
   private boolean returnInSub ;
   private boolean n8482OpeAct ;
   private boolean n653OpeNom ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AR62_A8482OpeAct ;
   private boolean[] P0AR62_n8482OpeAct ;
   private String[] P0AR62_A396EmprCod ;
   private String[] P0AR62_A653OpeNom ;
   private boolean[] P0AR62_n653OpeNom ;
   private int[] P0AR62_A652OpeCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class tmordmcloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AR62", "SELECT OpeAct, EmprCod, OpeNom, OpeCod FROM TXPOPERAR WHERE (EmprCod = ?) AND (OpeAct = 'A') ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
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
      }
   }

}

