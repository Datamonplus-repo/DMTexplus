package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class toperarloaddvcombo extends GXProcedure
{
   public toperarloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( toperarloaddvcombo.class ), "" );
   }

   public toperarloaddvcombo( int remoteHandle ,
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
      toperarloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      toperarloaddvcombo.this.AV12ComboName = aP0;
      toperarloaddvcombo.this.AV13TrnMode = aP1;
      toperarloaddvcombo.this.AV14EmprCod = aP2;
      toperarloaddvcombo.this.AV15OpeCod = aP3;
      toperarloaddvcombo.this.aP4 = aP4;
      toperarloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV12ComboName, "OpeTurno") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_OPETURNO' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "OpeSecc") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_OPESECC' */
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
      /* 'LOADCOMBOITEMS_OPETURNO' Routine */
      returnInSub = false ;
      /* Using cursor P09XT2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1161TurnCod = P09XT2_A1161TurnCod[0] ;
         A396EmprCod = P09XT2_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A1161TurnCod, 1, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(A1161TurnCod), "9")) );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09XT3 */
         pr_default.execute(1, new Object[] {AV14EmprCod, Integer.valueOf(AV15OpeCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A652OpeCod = P09XT3_A652OpeCod[0] ;
            A396EmprCod = P09XT3_A396EmprCod[0] ;
            A6232OpeTurno = P09XT3_A6232OpeTurno[0] ;
            n6232OpeTurno = P09XT3_n6232OpeTurno[0] ;
            AV16SelectedValue = ((0==A6232OpeTurno) ? "" : GXutil.trim( GXutil.str( A6232OpeTurno, 1, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_OPESECC' Routine */
      returnInSub = false ;
      /* Using cursor P09XT4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A13734MaqCDsc = P09XT4_A13734MaqCDsc[0] ;
         A602MaqCod = P09XT4_A602MaqCod[0] ;
         A606MaqDsc = P09XT4_A606MaqDsc[0] ;
         n606MaqDsc = P09XT4_n606MaqDsc[0] ;
         A396EmprCod = P09XT4_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A602MaqCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13734MaqCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09XT5 */
         pr_default.execute(3, new Object[] {AV14EmprCod, Integer.valueOf(AV15OpeCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A652OpeCod = P09XT5_A652OpeCod[0] ;
            A396EmprCod = P09XT5_A396EmprCod[0] ;
            A8422OpeSecc = P09XT5_A8422OpeSecc[0] ;
            n8422OpeSecc = P09XT5_n8422OpeSecc[0] ;
            AV16SelectedValue = A8422OpeSecc ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = toperarloaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = toperarloaddvcombo.this.AV10Combo_Data;
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
      P09XT2_A1161TurnCod = new byte[1] ;
      P09XT2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09XT3_A652OpeCod = new int[1] ;
      P09XT3_A396EmprCod = new String[] {""} ;
      P09XT3_A6232OpeTurno = new byte[1] ;
      P09XT3_n6232OpeTurno = new boolean[] {false} ;
      P09XT4_A13734MaqCDsc = new String[] {""} ;
      P09XT4_A602MaqCod = new String[] {""} ;
      P09XT4_A606MaqDsc = new String[] {""} ;
      P09XT4_n606MaqDsc = new boolean[] {false} ;
      P09XT4_A396EmprCod = new String[] {""} ;
      A13734MaqCDsc = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      P09XT5_A652OpeCod = new int[1] ;
      P09XT5_A396EmprCod = new String[] {""} ;
      P09XT5_A8422OpeSecc = new String[] {""} ;
      P09XT5_n8422OpeSecc = new boolean[] {false} ;
      A8422OpeSecc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.toperarloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09XT2_A1161TurnCod, P09XT2_A396EmprCod
            }
            , new Object[] {
            P09XT3_A652OpeCod, P09XT3_A396EmprCod, P09XT3_A6232OpeTurno, P09XT3_n6232OpeTurno
            }
            , new Object[] {
            P09XT4_A13734MaqCDsc, P09XT4_A602MaqCod, P09XT4_A606MaqDsc, P09XT4_n606MaqDsc, P09XT4_A396EmprCod
            }
            , new Object[] {
            P09XT5_A652OpeCod, P09XT5_A396EmprCod, P09XT5_A8422OpeSecc, P09XT5_n8422OpeSecc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1161TurnCod ;
   private byte A6232OpeTurno ;
   private short Gx_err ;
   private int AV15OpeCod ;
   private int A652OpeCod ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A8422OpeSecc ;
   private boolean returnInSub ;
   private boolean n6232OpeTurno ;
   private boolean n606MaqDsc ;
   private boolean n8422OpeSecc ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private String A13734MaqCDsc ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09XT2_A1161TurnCod ;
   private String[] P09XT2_A396EmprCod ;
   private int[] P09XT3_A652OpeCod ;
   private String[] P09XT3_A396EmprCod ;
   private byte[] P09XT3_A6232OpeTurno ;
   private boolean[] P09XT3_n6232OpeTurno ;
   private String[] P09XT4_A13734MaqCDsc ;
   private String[] P09XT4_A602MaqCod ;
   private String[] P09XT4_A606MaqDsc ;
   private boolean[] P09XT4_n606MaqDsc ;
   private String[] P09XT4_A396EmprCod ;
   private int[] P09XT5_A652OpeCod ;
   private String[] P09XT5_A396EmprCod ;
   private String[] P09XT5_A8422OpeSecc ;
   private boolean[] P09XT5_n8422OpeSecc ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class toperarloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09XT2", "SELECT TurnCod, EmprCod FROM TXPTURNOS ORDER BY TurnCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09XT3", "SELECT OpeCod, EmprCod, OpeTurno FROM TXPOPERAR WHERE EmprCod = ? and OpeCod = ? ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09XT4", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, MaqCod, MaqDsc, EmprCod FROM TXPMAQUIN ORDER BY MaqCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09XT5", "SELECT OpeCod, EmprCod, OpeSecc FROM TXPOPERAR WHERE EmprCod = ? and OpeCod = ? ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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

