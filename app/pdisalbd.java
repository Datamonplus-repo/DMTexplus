package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdisalbd extends GXProcedure
{
   public pdisalbd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdisalbd.class ), "" );
   }

   public pdisalbd( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pdisalbd.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      pdisalbd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdisalbd.this.AV8Discod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03SY2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8Discod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P03SY2_A361DisCod[0] ;
         A673Piezas = P03SY2_A673Piezas[0] ;
         A44AlbRecCod = P03SY2_A44AlbRecCod[0] ;
         AV10Albreccod = A44AlbRecCod ;
         /* Execute user subroutine: 'DISALD' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV11Disalb == 0 )
         {
            /* Execute user subroutine: 'UBIOUT' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Using cursor P03SY3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'DISALD' Routine */
      returnInSub = false ;
      AV11Disalb = (byte)(0) ;
      /* Using cursor P03SY4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV8Discod), Integer.valueOf(AV10Albreccod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A44AlbRecCod = P03SY4_A44AlbRecCod[0] ;
         A361DisCod = P03SY4_A361DisCod[0] ;
         A380DisPieCod = P03SY4_A380DisPieCod[0] ;
         AV11Disalb = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S121( )
   {
      /* 'UBIOUT' Routine */
      returnInSub = false ;
      /* Using cursor P03SY5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV8Discod), Integer.valueOf(AV10Albreccod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A44AlbRecCod = P03SY5_A44AlbRecCod[0] ;
         A361DisCod = P03SY5_A361DisCod[0] ;
         A9759Dis_PzU = P03SY5_A9759Dis_PzU[0] ;
         n9759Dis_PzU = P03SY5_n9759Dis_PzU[0] ;
         A9758Dis_UnU = P03SY5_A9758Dis_UnU[0] ;
         n9758Dis_UnU = P03SY5_n9758Dis_UnU[0] ;
         A9756Dis_CUb = P03SY5_A9756Dis_CUb[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A44AlbRecCod ;
         GXv_char3[0] = A9756Dis_CUb ;
         GXv_int4[0] = (short)(A9759Dis_PzU) ;
         GXv_int5[0] = (int)(DecimalUtil.decToDouble(A9758Dis_UnU)) ;
         GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
         GXv_int7[0] = 0 ;
         GXv_decimal8[0] = DecimalUtil.ZERO ;
         new app.pubiins(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_int4, GXv_int5, GXv_decimal6, GXv_int7, GXv_decimal8) ;
         pdisalbd.this.A396EmprCod = GXv_char1[0] ;
         pdisalbd.this.A44AlbRecCod = GXv_int2[0] ;
         pdisalbd.this.A9756Dis_CUb = GXv_char3[0] ;
         pdisalbd.this.A9759Dis_PzU = GXv_int4[0] ;
         pdisalbd.this.A9758Dis_UnU = DecimalUtil.doubleToDec(GXv_int5[0]) ;
         /* Using cursor P03SY6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A9756Dis_CUb});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUBIOUT");
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdisalbd.this.A396EmprCod;
      this.aP1[0] = pdisalbd.this.AV8Discod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdisalbd");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P03SY2_A396EmprCod = new String[] {""} ;
      P03SY2_A361DisCod = new int[1] ;
      P03SY2_A673Piezas = new int[1] ;
      P03SY2_A44AlbRecCod = new int[1] ;
      P03SY4_A396EmprCod = new String[] {""} ;
      P03SY4_A44AlbRecCod = new int[1] ;
      P03SY4_A361DisCod = new int[1] ;
      P03SY4_A380DisPieCod = new String[] {""} ;
      A380DisPieCod = "" ;
      P03SY5_A396EmprCod = new String[] {""} ;
      P03SY5_A44AlbRecCod = new int[1] ;
      P03SY5_A361DisCod = new int[1] ;
      P03SY5_A9759Dis_PzU = new int[1] ;
      P03SY5_n9759Dis_PzU = new boolean[] {false} ;
      P03SY5_A9758Dis_UnU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03SY5_n9758Dis_UnU = new boolean[] {false} ;
      P03SY5_A9756Dis_CUb = new String[] {""} ;
      A9758Dis_UnU = DecimalUtil.ZERO ;
      A9756Dis_CUb = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new short[1] ;
      GXv_int5 = new int[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_int7 = new int[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdisalbd__default(),
         new Object[] {
             new Object[] {
            P03SY2_A396EmprCod, P03SY2_A361DisCod, P03SY2_A673Piezas, P03SY2_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            P03SY4_A396EmprCod, P03SY4_A44AlbRecCod, P03SY4_A361DisCod, P03SY4_A380DisPieCod
            }
            , new Object[] {
            P03SY5_A396EmprCod, P03SY5_A44AlbRecCod, P03SY5_A361DisCod, P03SY5_A9759Dis_PzU, P03SY5_n9759Dis_PzU, P03SY5_A9758Dis_UnU, P03SY5_n9758Dis_UnU, P03SY5_A9756Dis_CUb
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11Disalb ;
   private short GXv_int4[] ;
   private short Gx_err ;
   private int AV8Discod ;
   private int A361DisCod ;
   private int A673Piezas ;
   private int A44AlbRecCod ;
   private int AV10Albreccod ;
   private int A9759Dis_PzU ;
   private int GXv_int2[] ;
   private int GXv_int5[] ;
   private int GXv_int7[] ;
   private java.math.BigDecimal A9758Dis_UnU ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A380DisPieCod ;
   private String A9756Dis_CUb ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private boolean returnInSub ;
   private boolean n9759Dis_PzU ;
   private boolean n9758Dis_UnU ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P03SY2_A396EmprCod ;
   private int[] P03SY2_A361DisCod ;
   private int[] P03SY2_A673Piezas ;
   private int[] P03SY2_A44AlbRecCod ;
   private String[] P03SY4_A396EmprCod ;
   private int[] P03SY4_A44AlbRecCod ;
   private int[] P03SY4_A361DisCod ;
   private String[] P03SY4_A380DisPieCod ;
   private String[] P03SY5_A396EmprCod ;
   private int[] P03SY5_A44AlbRecCod ;
   private int[] P03SY5_A361DisCod ;
   private int[] P03SY5_A9759Dis_PzU ;
   private boolean[] P03SY5_n9759Dis_PzU ;
   private java.math.BigDecimal[] P03SY5_A9758Dis_UnU ;
   private boolean[] P03SY5_n9758Dis_UnU ;
   private String[] P03SY5_A9756Dis_CUb ;
}

final  class pdisalbd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03SY2", "SELECT EmprCod, DisCod, Piezas, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03SY3", "DELETE FROM TXPDISALB  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new ForEachCursor("P03SY4", "SELECT * FROM (SELECT EmprCod, AlbRecCod, DisCod, DisPieCod FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ? ORDER BY EmprCod, DisCod, AlbRecCod, DisPieCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03SY5", "SELECT EmprCod, AlbRecCod, DisCod, Dis_PzU, Dis_UnU, Dis_CUb FROM TXPUBIOUT WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ? ORDER BY EmprCod, DisCod, AlbRecCod, Dis_CUb ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03SY6", "DELETE FROM TXPUBIOUT  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? AND Dis_CUb = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPUBIOUT")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 10);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 10);
               return;
      }
   }

}

