package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class procesosquimicos_trnloaddvcombo extends GXProcedure
{
   public procesosquimicos_trnloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( procesosquimicos_trnloaddvcombo.class ), "" );
   }

   public procesosquimicos_trnloaddvcombo( int remoteHandle ,
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
      procesosquimicos_trnloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      procesosquimicos_trnloaddvcombo.this.AV12ComboName = aP0;
      procesosquimicos_trnloaddvcombo.this.AV13TrnMode = aP1;
      procesosquimicos_trnloaddvcombo.this.AV14EmprCod = aP2;
      procesosquimicos_trnloaddvcombo.this.AV15ProForCod = aP3;
      procesosquimicos_trnloaddvcombo.this.aP4 = aP4;
      procesosquimicos_trnloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV12ComboName, "ProForLab") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PROFORLAB' */
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
      /* 'LOADCOMBOITEMS_PROFORLAB' Routine */
      returnInSub = false ;
      /* Using cursor P09T22 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13133ProForAct = P09T22_A13133ProForAct[0] ;
         A13740ProFDsc = P09T22_A13740ProFDsc[0] ;
         A764ProForCod = P09T22_A764ProForCod[0] ;
         A766ProForDsc = P09T22_A766ProForDsc[0] ;
         A396EmprCod = P09T22_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A764ProForCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13740ProFDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09T23 */
         pr_default.execute(1, new Object[] {AV14EmprCod, AV15ProForCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A764ProForCod = P09T23_A764ProForCod[0] ;
            A396EmprCod = P09T23_A396EmprCod[0] ;
            A6061ProForLab = P09T23_A6061ProForLab[0] ;
            AV16SelectedValue = A6061ProForLab ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = procesosquimicos_trnloaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = procesosquimicos_trnloaddvcombo.this.AV10Combo_Data;
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
      P09T22_A13133ProForAct = new String[] {""} ;
      P09T22_A13740ProFDsc = new String[] {""} ;
      P09T22_A764ProForCod = new String[] {""} ;
      P09T22_A766ProForDsc = new String[] {""} ;
      P09T22_A396EmprCod = new String[] {""} ;
      A13133ProForAct = "" ;
      A13740ProFDsc = "" ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09T23_A764ProForCod = new String[] {""} ;
      P09T23_A396EmprCod = new String[] {""} ;
      P09T23_A6061ProForLab = new String[] {""} ;
      A6061ProForLab = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.procesosquimicos_trnloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09T22_A13133ProForAct, P09T22_A13740ProFDsc, P09T22_A764ProForCod, P09T22_A766ProForDsc, P09T22_A396EmprCod
            }
            , new Object[] {
            P09T23_A764ProForCod, P09T23_A396EmprCod, P09T23_A6061ProForLab
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String AV15ProForCod ;
   private String scmdbuf ;
   private String A13133ProForAct ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String A396EmprCod ;
   private String A6061ProForLab ;
   private boolean returnInSub ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private String A13740ProFDsc ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09T22_A13133ProForAct ;
   private String[] P09T22_A13740ProFDsc ;
   private String[] P09T22_A764ProForCod ;
   private String[] P09T22_A766ProForDsc ;
   private String[] P09T22_A396EmprCod ;
   private String[] P09T23_A764ProForCod ;
   private String[] P09T23_A396EmprCod ;
   private String[] P09T23_A6061ProForLab ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class procesosquimicos_trnloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09T22", "SELECT ProForAct, RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) AS ProFDsc, ProForCod, ProForDsc, EmprCod FROM TXPCPROFO WHERE ProForAct = 'S' ORDER BY ProFDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09T23", "SELECT ProForCod, EmprCod, ProForLab FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

