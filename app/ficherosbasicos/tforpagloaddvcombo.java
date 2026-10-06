package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tforpagloaddvcombo extends GXProcedure
{
   public tforpagloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tforpagloaddvcombo.class ), "" );
   }

   public tforpagloaddvcombo( int remoteHandle ,
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
      tforpagloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      tforpagloaddvcombo.this.AV12ComboName = aP0;
      tforpagloaddvcombo.this.AV13TrnMode = aP1;
      tforpagloaddvcombo.this.AV14EmprCod = aP2;
      tforpagloaddvcombo.this.AV15FpgCod = aP3;
      tforpagloaddvcombo.this.aP4 = aP4;
      tforpagloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV12ComboName, "FpgTip") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_FPGTIP' */
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
      /* 'LOADCOMBOITEMS_FPGTIP' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09ZH2 */
         pr_default.execute(0, new Object[] {AV14EmprCod, AV15FpgCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A497FpgCod = P09ZH2_A497FpgCod[0] ;
            A396EmprCod = P09ZH2_A396EmprCod[0] ;
            A955FpgTip = P09ZH2_A955FpgTip[0] ;
            n955FpgTip = P09ZH2_n955FpgTip[0] ;
            AV16SelectedValue = A955FpgTip ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = tforpagloaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = tforpagloaddvcombo.this.AV10Combo_Data;
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
      P09ZH2_A497FpgCod = new String[] {""} ;
      P09ZH2_A396EmprCod = new String[] {""} ;
      P09ZH2_A955FpgTip = new String[] {""} ;
      P09ZH2_n955FpgTip = new boolean[] {false} ;
      A497FpgCod = "" ;
      A396EmprCod = "" ;
      A955FpgTip = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tforpagloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09ZH2_A497FpgCod, P09ZH2_A396EmprCod, P09ZH2_A955FpgTip, P09ZH2_n955FpgTip
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String AV15FpgCod ;
   private String scmdbuf ;
   private String A497FpgCod ;
   private String A396EmprCod ;
   private String A955FpgTip ;
   private boolean returnInSub ;
   private boolean n955FpgTip ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09ZH2_A497FpgCod ;
   private String[] P09ZH2_A396EmprCod ;
   private String[] P09ZH2_A955FpgTip ;
   private boolean[] P09ZH2_n955FpgTip ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class tforpagloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09ZH2", "SELECT FpgCod, EmprCod, FpgTip FROM TXPFORPAG WHERE EmprCod = ? and FpgCod = ? ORDER BY EmprCod, FpgCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
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
               stmt.setString(2, (String)parms[1], 2);
               return;
      }
   }

}

