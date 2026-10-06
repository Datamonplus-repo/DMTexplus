package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodrem extends GXProcedure
{
   public pmodrem( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodrem.class ), "" );
   }

   public pmodrem( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     String[] aP1 ,
                                     java.math.BigDecimal[] aP2 )
   {
      pmodrem.this.aP3 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.util.Date[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.util.Date[] aP3 )
   {
      pmodrem.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmodrem.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      pmodrem.this.AV15Difer = aP2[0];
      this.aP2 = aP2;
      pmodrem.this.AV19FecRec = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "In PMODREM", "") );
      if ( AV15Difer.doubleValue() < 0 )
      {
         AV16Unidades = AV15Difer.negate() ;
      }
      else
      {
         AV16Unidades = AV15Difer ;
      }
      AV17Unid = AV16Unidades ;
      AV18OkEntAlm = (byte)(0) ;
      /* Using cursor P004N2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A411EntCon = P004N2_A411EntCon[0] ;
         A419EntUniRem = P004N2_A419EntUniRem[0] ;
         A415EntFecEnt = P004N2_A415EntFecEnt[0] ;
         A597LinEnt = P004N2_A597LinEnt[0] ;
         AV18OkEntAlm = (byte)(1) ;
         Gx_msg = A719PrdNum + httpContext.getMessage( " Und= ", "") + GXutil.str( AV16Unidades, 9, 2) + httpContext.getMessage( " In PMODREM. Act ENTALM", "") ;
         System.out.println( Gx_msg );
         if ( AV15Difer.doubleValue() < 0 )
         {
            if ( DecimalUtil.compareTo((A419EntUniRem.add(AV16Unidades)), DecimalUtil.stringToDec("999999.9999")) > 0 )
            {
               A419EntUniRem = DecimalUtil.stringToDec("999999.9999") ;
            }
            else
            {
               A419EntUniRem = A419EntUniRem.add(AV16Unidades) ;
            }
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            /* Using cursor P004N3 */
            pr_default.execute(1, new Object[] {Byte.valueOf(A411EntCon), A419EntUniRem, A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
            if (true) break;
         }
         else
         {
            if ( DecimalUtil.compareTo(AV16Unidades, A419EntUniRem) == 0 )
            {
               AV16Unidades = DecimalUtil.doubleToDec(0) ;
               A419EntUniRem = DecimalUtil.doubleToDec(0) ;
               A411EntCon = (byte)(1) ;
            }
            else
            {
               if ( DecimalUtil.compareTo(AV16Unidades, A419EntUniRem) < 0 )
               {
                  A419EntUniRem = A419EntUniRem.subtract(AV16Unidades) ;
                  AV16Unidades = DecimalUtil.doubleToDec(0) ;
               }
               else
               {
                  A411EntCon = (byte)(1) ;
                  AV16Unidades = AV16Unidades.subtract(A419EntUniRem) ;
                  A419EntUniRem = DecimalUtil.doubleToDec(0) ;
               }
            }
            if ( AV16Unidades.doubleValue() == 0 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               /* Using cursor P004N4 */
               pr_default.execute(2, new Object[] {Byte.valueOf(A411EntCon), A419EntUniRem, A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
               if (true) break;
            }
         }
         Gx_msg = A719PrdNum + " " + httpContext.getMessage( "End PMODREM. Act ENTALM", "") ;
         System.out.println( Gx_msg );
         /* Using cursor P004N5 */
         pr_default.execute(3, new Object[] {Byte.valueOf(A411EntCon), A419EntUniRem, A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV18OkEntAlm == 0 )
      {
         GXv_char1[0] = A396EmprCod ;
         GXv_char2[0] = A719PrdNum ;
         GXv_int3[0] = AV21LinEnt ;
         new app.plinent(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3) ;
         pmodrem.this.A396EmprCod = GXv_char1[0] ;
         pmodrem.this.A719PrdNum = GXv_char2[0] ;
         pmodrem.this.AV21LinEnt = GXv_int3[0] ;
         Gx_msg = A719PrdNum + httpContext.getMessage( " Go PALTREM", "") ;
         System.out.println( Gx_msg );
         GXv_char2[0] = A396EmprCod ;
         GXv_char1[0] = A719PrdNum ;
         GXv_int3[0] = AV21LinEnt ;
         GXv_date4[0] = AV19FecRec ;
         GXv_decimal5[0] = AV16Unidades ;
         new app.paltrem(remoteHandle, context).execute( GXv_char2, GXv_char1, GXv_int3, GXv_date4, GXv_decimal5) ;
         pmodrem.this.A396EmprCod = GXv_char2[0] ;
         pmodrem.this.A719PrdNum = GXv_char1[0] ;
         pmodrem.this.AV21LinEnt = GXv_int3[0] ;
         pmodrem.this.AV19FecRec = GXv_date4[0] ;
         pmodrem.this.AV16Unidades = GXv_decimal5[0] ;
         Gx_msg = A719PrdNum + httpContext.getMessage( " Return PALTREM", "") ;
         System.out.println( Gx_msg );
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodrem.this.A396EmprCod;
      this.aP1[0] = pmodrem.this.A719PrdNum;
      this.aP2[0] = pmodrem.this.AV15Difer;
      this.aP3[0] = pmodrem.this.AV19FecRec;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmodrem");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16Unidades = DecimalUtil.ZERO ;
      AV17Unid = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P004N2_A396EmprCod = new String[] {""} ;
      P004N2_A719PrdNum = new String[] {""} ;
      P004N2_A411EntCon = new byte[1] ;
      P004N2_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004N2_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P004N2_A597LinEnt = new short[1] ;
      A419EntUniRem = DecimalUtil.ZERO ;
      A415EntFecEnt = GXutil.nullDate() ;
      Gx_msg = "" ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_int3 = new short[1] ;
      GXv_date4 = new java.util.Date[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodrem__default(),
         new Object[] {
             new Object[] {
            P004N2_A396EmprCod, P004N2_A719PrdNum, P004N2_A411EntCon, P004N2_A419EntUniRem, P004N2_A415EntFecEnt, P004N2_A597LinEnt
            }
            , new Object[] {
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

   private byte AV18OkEntAlm ;
   private byte A411EntCon ;
   private short A597LinEnt ;
   private short AV21LinEnt ;
   private short GXv_int3[] ;
   private short Gx_err ;
   private java.math.BigDecimal AV15Difer ;
   private java.math.BigDecimal AV16Unidades ;
   private java.math.BigDecimal AV17Unid ;
   private java.math.BigDecimal A419EntUniRem ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private String Gx_msg ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private java.util.Date AV19FecRec ;
   private java.util.Date A415EntFecEnt ;
   private java.util.Date GXv_date4[] ;
   private java.util.Date[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P004N2_A396EmprCod ;
   private String[] P004N2_A719PrdNum ;
   private byte[] P004N2_A411EntCon ;
   private java.math.BigDecimal[] P004N2_A419EntUniRem ;
   private java.util.Date[] P004N2_A415EntFecEnt ;
   private short[] P004N2_A597LinEnt ;
}

final  class pmodrem__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004N2", "SELECT EmprCod, PrdNum, EntCon, EntUniRem, EntFecEnt, LinEnt FROM TXPENTALM WHERE (EmprCod = ? and PrdNum = ?) AND (EntCon = 0) ORDER BY EmprCod, PrdNum, EntFecEnt ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P004N3", "UPDATE TXPENTALM SET EntCon=?, EntUniRem=?  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENTALM")
         ,new UpdateCursor("P004N4", "UPDATE TXPENTALM SET EntCon=?, EntUniRem=?  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENTALM")
         ,new UpdateCursor("P004N5", "UPDATE TXPENTALM SET EntCon=?, EntUniRem=?  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENTALM")
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

