package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmordcoloaddvcombo extends GXProcedure
{
   public tmordcoloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmordcoloaddvcombo.class ), "" );
   }

   public tmordcoloaddvcombo( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> executeUdp( String aP0 ,
                                                                                    String aP1 ,
                                                                                    String aP2 ,
                                                                                    int aP3 ,
                                                                                    int aP4 ,
                                                                                    String aP5 ,
                                                                                    String[] aP6 )
   {
      tmordcoloaddvcombo.this.aP7 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        int aP3 ,
                        int aP4 ,
                        String aP5 ,
                        String[] aP6 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             int aP3 ,
                             int aP4 ,
                             String aP5 ,
                             String[] aP6 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP7 )
   {
      tmordcoloaddvcombo.this.AV12ComboName = aP0;
      tmordcoloaddvcombo.this.AV13TrnMode = aP1;
      tmordcoloaddvcombo.this.AV14EmprCod = aP2;
      tmordcoloaddvcombo.this.AV15OMCod = aP3;
      tmordcoloaddvcombo.this.AV16OMOpeCod = aP4;
      tmordcoloaddvcombo.this.AV17OMMTpo = aP5;
      tmordcoloaddvcombo.this.aP6 = aP6;
      tmordcoloaddvcombo.this.aP7 = aP7;
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
      /* Using cursor P0ARN2 */
      pr_default.execute(0, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8482OpeAct = P0ARN2_A8482OpeAct[0] ;
         n8482OpeAct = P0ARN2_n8482OpeAct[0] ;
         A396EmprCod = P0ARN2_A396EmprCod[0] ;
         A653OpeNom = P0ARN2_A653OpeNom[0] ;
         n653OpeNom = P0ARN2_n653OpeNom[0] ;
         A652OpeCod = P0ARN2_A652OpeCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A652OpeCod, 6, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9"))+"-"+GXutil.trim( A653OpeNom) );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0ARN3 */
         pr_default.execute(1, new Object[] {AV14EmprCod, Integer.valueOf(AV15OMCod), Integer.valueOf(AV16OMOpeCod), AV17OMMTpo});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A9458OMMTpo = P0ARN3_A9458OMMTpo[0] ;
            A9455OMOpeCod = P0ARN3_A9455OMOpeCod[0] ;
            A9425OMCod = P0ARN3_A9425OMCod[0] ;
            A396EmprCod = P0ARN3_A396EmprCod[0] ;
            AV18SelectedValue = ((0==A9455OMOpeCod) ? "" : GXutil.trim( GXutil.str( A9455OMOpeCod, 6, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      else
      {
         if ( ! (0==AV16OMOpeCod) )
         {
            AV18SelectedValue = GXutil.trim( GXutil.str( AV16OMOpeCod, 6, 0)) ;
         }
      }
   }

   protected void cleanup( )
   {
      this.aP6[0] = tmordcoloaddvcombo.this.AV18SelectedValue;
      this.aP7[0] = tmordcoloaddvcombo.this.AV10Combo_Data;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18SelectedValue = "" ;
      AV10Combo_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      scmdbuf = "" ;
      P0ARN2_A8482OpeAct = new String[] {""} ;
      P0ARN2_n8482OpeAct = new boolean[] {false} ;
      P0ARN2_A396EmprCod = new String[] {""} ;
      P0ARN2_A653OpeNom = new String[] {""} ;
      P0ARN2_n653OpeNom = new boolean[] {false} ;
      P0ARN2_A652OpeCod = new int[1] ;
      A8482OpeAct = "" ;
      A396EmprCod = "" ;
      A653OpeNom = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P0ARN3_A9458OMMTpo = new String[] {""} ;
      P0ARN3_A9455OMOpeCod = new int[1] ;
      P0ARN3_A9425OMCod = new int[1] ;
      P0ARN3_A396EmprCod = new String[] {""} ;
      A9458OMMTpo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmordcoloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0ARN2_A8482OpeAct, P0ARN2_n8482OpeAct, P0ARN2_A396EmprCod, P0ARN2_A653OpeNom, P0ARN2_n653OpeNom, P0ARN2_A652OpeCod
            }
            , new Object[] {
            P0ARN3_A9458OMMTpo, P0ARN3_A9455OMOpeCod, P0ARN3_A9425OMCod, P0ARN3_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV15OMCod ;
   private int AV16OMOpeCod ;
   private int A652OpeCod ;
   private int A9455OMOpeCod ;
   private int A9425OMCod ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String AV17OMMTpo ;
   private String scmdbuf ;
   private String A8482OpeAct ;
   private String A396EmprCod ;
   private String A653OpeNom ;
   private String A9458OMMTpo ;
   private boolean returnInSub ;
   private boolean n8482OpeAct ;
   private boolean n653OpeNom ;
   private String AV12ComboName ;
   private String AV18SelectedValue ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP7 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ARN2_A8482OpeAct ;
   private boolean[] P0ARN2_n8482OpeAct ;
   private String[] P0ARN2_A396EmprCod ;
   private String[] P0ARN2_A653OpeNom ;
   private boolean[] P0ARN2_n653OpeNom ;
   private int[] P0ARN2_A652OpeCod ;
   private String[] P0ARN3_A9458OMMTpo ;
   private int[] P0ARN3_A9455OMOpeCod ;
   private int[] P0ARN3_A9425OMCod ;
   private String[] P0ARN3_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class tmordcoloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ARN2", "SELECT OpeAct, EmprCod, OpeNom, OpeCod FROM TXPOPERAR WHERE (EmprCod = ?) AND (OpeAct = 'A') ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ARN3", "SELECT OMMTpo, OMOpeCod, OMCod, EmprCod FROM TXPMOrMO WHERE EmprCod = ? and OMCod = ? and OMOpeCod = ? and OMMTpo = ? ORDER BY EmprCod, OMCod, OMOpeCod, OMMTpo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

