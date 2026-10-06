package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pacesp2 extends GXProcedure
{
   public pacesp2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pacesp2.class ), "" );
   }

   public pacesp2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        java.util.Date aP2 ,
                        java.math.BigDecimal aP3 ,
                        java.math.BigDecimal aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             java.util.Date aP2 ,
                             java.math.BigDecimal aP3 ,
                             java.math.BigDecimal aP4 )
   {
      pacesp2.this.A396EmprCod = aP0;
      pacesp2.this.A719PrdNum = aP1;
      pacesp2.this.AV17Fecha = aP2;
      pacesp2.this.AV16Unidades = aP3;
      pacesp2.this.AV15Precio = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV23FlagMab ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MABERA", ""), GXv_int1) ;
      pacesp2.this.AV23FlagMab = GXv_int1[0] ;
      /* Using cursor P004M2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A720PrdNumMes = P004M2_A720PrdNumMes[0] ;
         A681PrdAny = P004M2_A681PrdAny[0] ;
         A744PrdUniConM = P004M2_A744PrdUniConM[0] ;
         A747PrdValConM = P004M2_A747PrdValConM[0] ;
         if ( ( A681PrdAny == GXutil.year( GXutil.today( )) ) && ( A720PrdNumMes == GXutil.month( GXutil.today( )) ) )
         {
            A744PrdUniConM = A744PrdUniConM.subtract(AV16Unidades) ;
            A747PrdValConM = A747PrdValConM.subtract((AV15Precio.multiply(AV16Unidades))) ;
            /* Using cursor P004M3 */
            pr_default.execute(1, new Object[] {A744PrdUniConM, A747PrdValConM, A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(A720PrdNumMes)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRDES");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV20OkEntAlm = (byte)(0) ;
      AV19Unid = AV16Unidades ;
      /* Using cursor P004M4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A411EntCon = P004M4_A411EntCon[0] ;
         A419EntUniRem = P004M4_A419EntUniRem[0] ;
         A415EntFecEnt = P004M4_A415EntFecEnt[0] ;
         A597LinEnt = P004M4_A597LinEnt[0] ;
         A419EntUniRem = A419EntUniRem.add(AV16Unidades) ;
         AV20OkEntAlm = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         /* Using cursor P004M5 */
         pr_default.execute(3, new Object[] {A419EntUniRem, A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
         if (true) break;
         /* Using cursor P004M6 */
         pr_default.execute(4, new Object[] {A419EntUniRem, A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( AV20OkEntAlm == 0 )
      {
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_int4[0] = AV21LinEnt ;
         new app.plinent(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4) ;
         pacesp2.this.A396EmprCod = GXv_char2[0] ;
         pacesp2.this.A719PrdNum = GXv_char3[0] ;
         pacesp2.this.AV21LinEnt = GXv_int4[0] ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char2[0] = A719PrdNum ;
         GXv_int4[0] = AV21LinEnt ;
         GXv_date5[0] = AV17Fecha ;
         GXv_decimal6[0] = AV16Unidades ;
         new app.paltrem(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_int4, GXv_date5, GXv_decimal6) ;
         pacesp2.this.A396EmprCod = GXv_char3[0] ;
         pacesp2.this.A719PrdNum = GXv_char2[0] ;
         pacesp2.this.AV21LinEnt = GXv_int4[0] ;
         pacesp2.this.AV17Fecha = GXv_date5[0] ;
         pacesp2.this.AV16Unidades = GXv_decimal6[0] ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pacesp2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P004M2_A396EmprCod = new String[] {""} ;
      P004M2_A719PrdNum = new String[] {""} ;
      P004M2_A720PrdNumMes = new byte[1] ;
      P004M2_A681PrdAny = new short[1] ;
      P004M2_A744PrdUniConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004M2_A747PrdValConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A744PrdUniConM = DecimalUtil.ZERO ;
      A747PrdValConM = DecimalUtil.ZERO ;
      AV19Unid = DecimalUtil.ZERO ;
      P004M4_A396EmprCod = new String[] {""} ;
      P004M4_A719PrdNum = new String[] {""} ;
      P004M4_A411EntCon = new byte[1] ;
      P004M4_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004M4_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P004M4_A597LinEnt = new short[1] ;
      A419EntUniRem = DecimalUtil.ZERO ;
      A415EntFecEnt = GXutil.nullDate() ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int4 = new short[1] ;
      GXv_date5 = new java.util.Date[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pacesp2__default(),
         new Object[] {
             new Object[] {
            P004M2_A396EmprCod, P004M2_A719PrdNum, P004M2_A720PrdNumMes, P004M2_A681PrdAny, P004M2_A744PrdUniConM, P004M2_A747PrdValConM
            }
            , new Object[] {
            }
            , new Object[] {
            P004M4_A396EmprCod, P004M4_A719PrdNum, P004M4_A411EntCon, P004M4_A419EntUniRem, P004M4_A415EntFecEnt, P004M4_A597LinEnt
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV23FlagMab ;
   private byte GXv_int1[] ;
   private byte A720PrdNumMes ;
   private byte AV20OkEntAlm ;
   private byte A411EntCon ;
   private short A681PrdAny ;
   private short A597LinEnt ;
   private short AV21LinEnt ;
   private short GXv_int4[] ;
   private short Gx_err ;
   private java.math.BigDecimal AV16Unidades ;
   private java.math.BigDecimal AV15Precio ;
   private java.math.BigDecimal A744PrdUniConM ;
   private java.math.BigDecimal A747PrdValConM ;
   private java.math.BigDecimal AV19Unid ;
   private java.math.BigDecimal A419EntUniRem ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private java.util.Date AV17Fecha ;
   private java.util.Date A415EntFecEnt ;
   private java.util.Date GXv_date5[] ;
   private IDataStoreProvider pr_default ;
   private String[] P004M2_A396EmprCod ;
   private String[] P004M2_A719PrdNum ;
   private byte[] P004M2_A720PrdNumMes ;
   private short[] P004M2_A681PrdAny ;
   private java.math.BigDecimal[] P004M2_A744PrdUniConM ;
   private java.math.BigDecimal[] P004M2_A747PrdValConM ;
   private String[] P004M4_A396EmprCod ;
   private String[] P004M4_A719PrdNum ;
   private byte[] P004M4_A411EntCon ;
   private java.math.BigDecimal[] P004M4_A419EntUniRem ;
   private java.util.Date[] P004M4_A415EntFecEnt ;
   private short[] P004M4_A597LinEnt ;
}

final  class pacesp2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004M2", "SELECT EmprCod, PrdNum, PrdNumMes, PrdAny, PrdUniConM, PrdValConM FROM TXPLPRDES WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P004M3", "UPDATE TXPLPRDES SET PrdUniConM=?, PrdValConM=?  WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ? AND PrdNumMes = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRDES")
         ,new ForEachCursor("P004M4", "SELECT EmprCod, PrdNum, EntCon, EntUniRem, EntFecEnt, LinEnt FROM TXPENTALM WHERE (EmprCod = ? and PrdNum = ?) AND (EntCon = 0) ORDER BY EmprCod, PrdNum, EntFecEnt ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P004M5", "UPDATE TXPENTALM SET EntUniRem=?  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENTALM")
         ,new UpdateCursor("P004M6", "UPDATE TXPENTALM SET EntUniRem=?  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENTALM")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 4 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

