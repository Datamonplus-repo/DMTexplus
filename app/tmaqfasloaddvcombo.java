package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmaqfasloaddvcombo extends GXProcedure
{
   public tmaqfasloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmaqfasloaddvcombo.class ), "" );
   }

   public tmaqfasloaddvcombo( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> executeUdp( String aP0 ,
                                                                                    String aP1 ,
                                                                                    String aP2 ,
                                                                                    String aP3 ,
                                                                                    String[] aP4 )
   {
      tmaqfasloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String[] aP4 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String[] aP4 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 )
   {
      tmaqfasloaddvcombo.this.AV12ComboName = aP0;
      tmaqfasloaddvcombo.this.AV13TrnMode = aP1;
      tmaqfasloaddvcombo.this.AV14EmprCod = aP2;
      tmaqfasloaddvcombo.this.AV15MaqCod = aP3;
      tmaqfasloaddvcombo.this.aP4 = aP4;
      tmaqfasloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV12ComboName, "MaqFCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_MAQFCOD' */
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
      /* 'LOADCOMBOITEMS_MAQFCOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09XX2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14042FasActiva = P09XX2_A14042FasActiva[0] ;
         A460FasDsc = P09XX2_A460FasDsc[0] ;
         A457FasCod = P09XX2_A457FasCod[0] ;
         A396EmprCod = P09XX2_A396EmprCod[0] ;
         A13781FasCDsc = GXutil.trim( A457FasCod) + "-" + GXutil.trim( A460FasDsc) ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A457FasCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( ((GXutil.strcmp(A14042FasActiva, "N")==0) ? GXutil.trim( A457FasCod)+"-"+GXutil.trim( A460FasDsc)+httpContext.getMessage( " Inactiva", "") : A13781FasCDsc) );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV10Combo_Data.sort("Title");
   }

   protected void cleanup( )
   {
      this.aP4[0] = tmaqfasloaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = tmaqfasloaddvcombo.this.AV10Combo_Data;
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
      P09XX2_A14042FasActiva = new String[] {""} ;
      P09XX2_A460FasDsc = new String[] {""} ;
      P09XX2_A457FasCod = new String[] {""} ;
      P09XX2_A396EmprCod = new String[] {""} ;
      A14042FasActiva = "" ;
      A460FasDsc = "" ;
      A457FasCod = "" ;
      A396EmprCod = "" ;
      A13781FasCDsc = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmaqfasloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09XX2_A14042FasActiva, P09XX2_A460FasDsc, P09XX2_A457FasCod, P09XX2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String AV15MaqCod ;
   private String scmdbuf ;
   private String A14042FasActiva ;
   private String A460FasDsc ;
   private String A457FasCod ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private String A13781FasCDsc ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09XX2_A14042FasActiva ;
   private String[] P09XX2_A460FasDsc ;
   private String[] P09XX2_A457FasCod ;
   private String[] P09XX2_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class tmaqfasloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09XX2", "SELECT FasActiva, FasDsc, FasCod, EmprCod FROM TXPFASPRO ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 28);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
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

