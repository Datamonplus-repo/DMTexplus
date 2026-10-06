package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tclimarcasloaddvcombo extends GXProcedure
{
   public tclimarcasloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tclimarcasloaddvcombo.class ), "" );
   }

   public tclimarcasloaddvcombo( int remoteHandle ,
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
      tclimarcasloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      tclimarcasloaddvcombo.this.AV12ComboName = aP0;
      tclimarcasloaddvcombo.this.AV13TrnMode = aP1;
      tclimarcasloaddvcombo.this.AV14EmprCod = aP2;
      tclimarcasloaddvcombo.this.AV15CliCod = aP3;
      tclimarcasloaddvcombo.this.aP4 = aP4;
      tclimarcasloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV12ComboName, "CliMarcaID") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_CLIMARCAID' */
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
      /* 'LOADCOMBOITEMS_CLIMARCAID' Routine */
      returnInSub = false ;
      /* Using cursor P0A1L2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14001Id_MarcaDs = P0A1L2_A14001Id_MarcaDs[0] ;
         A11659MarcaId = P0A1L2_A11659MarcaId[0] ;
         A11660MarcaDsc = P0A1L2_A11660MarcaDsc[0] ;
         n11660MarcaDsc = P0A1L2_n11660MarcaDsc[0] ;
         A396EmprCod = P0A1L2_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A11659MarcaId );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A14001Id_MarcaDs );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP4[0] = tclimarcasloaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = tclimarcasloaddvcombo.this.AV10Combo_Data;
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
      P0A1L2_A14001Id_MarcaDs = new String[] {""} ;
      P0A1L2_A11659MarcaId = new String[] {""} ;
      P0A1L2_A11660MarcaDsc = new String[] {""} ;
      P0A1L2_n11660MarcaDsc = new boolean[] {false} ;
      P0A1L2_A396EmprCod = new String[] {""} ;
      A14001Id_MarcaDs = "" ;
      A11659MarcaId = "" ;
      A11660MarcaDsc = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tclimarcasloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0A1L2_A14001Id_MarcaDs, P0A1L2_A11659MarcaId, P0A1L2_A11660MarcaDsc, P0A1L2_n11660MarcaDsc, P0A1L2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV15CliCod ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String scmdbuf ;
   private String A14001Id_MarcaDs ;
   private String A11659MarcaId ;
   private String A11660MarcaDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean n11660MarcaDsc ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A1L2_A14001Id_MarcaDs ;
   private String[] P0A1L2_A11659MarcaId ;
   private String[] P0A1L2_A11660MarcaDsc ;
   private boolean[] P0A1L2_n11660MarcaDsc ;
   private String[] P0A1L2_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class tclimarcasloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A1L2", "SELECT RTRIM(LTRIM(MarcaId)) || '-' || RTRIM(LTRIM(COALESCE( MarcaDsc, ''))) AS Id_MarcaDs, MarcaId, MarcaDsc, EmprCod FROM TXPMARCAS WHERE MarcaId <> ' ' ORDER BY Id_MarcaDs ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

