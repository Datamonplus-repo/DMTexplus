package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pordprd1 extends GXProcedure
{
   public pordprd1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pordprd1.class ), "" );
   }

   public pordprd1( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           short[] aP1 ,
                           byte[] aP2 )
   {
      pordprd1.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        byte[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             byte[] aP2 ,
                             byte[] aP3 )
   {
      pordprd1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pordprd1.this.AV15Any = aP1[0];
      this.aP1 = aP1;
      pordprd1.this.AV16MesI = aP2[0];
      this.aP2 = aP2;
      pordprd1.this.AV18MesF = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02XG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(AV15Any)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A681PrdAny = P02XG2_A681PrdAny[0] ;
         A719PrdNum = P02XG2_A719PrdNum[0] ;
         A3915EmpNumDec = P02XG2_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P02XG2_n3915EmpNumDec[0] ;
         A331DifValConA = P02XG2_A331DifValConA[0] ;
         n331DifValConA = P02XG2_n331DifValConA[0] ;
         A3915EmpNumDec = P02XG2_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P02XG2_n3915EmpNumDec[0] ;
         AV17PrdValConM = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P02XG3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(AV16MesI), Byte.valueOf(AV18MesF)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A720PrdNumMes = P02XG3_A720PrdNumMes[0] ;
            A747PrdValConM = P02XG3_A747PrdValConM[0] ;
            Gx_msg = httpContext.getMessage( "Prdnum=", "") + A719PrdNum + GXutil.chr( (short)(13)) ;
            Gx_msg += httpContext.getMessage( "&PrdValConM=", "") + GXutil.str( AV17PrdValConM, 12, 2) + GXutil.chr( (short)(13)) ;
            Gx_msg += httpContext.getMessage( " PrdValConM=", "") + GXutil.str( A747PrdValConM, 12, 2) + GXutil.chr( (short)(13)) ;
            System.out.println( Gx_msg );
            if ( DecimalUtil.compareTo((AV17PrdValConM.add(A747PrdValConM)), DecimalUtil.stringToDec("999999999.99")) > 0 )
            {
               AV17PrdValConM = DecimalUtil.stringToDec("999999999.99") ;
            }
            else
            {
               AV17PrdValConM = AV17PrdValConM.add(A747PrdValConM) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( A3915EmpNumDec == 0 )
         {
            A331DifValConA = DecimalUtil.doubleToDec(999999999).subtract(AV17PrdValConM) ;
            n331DifValConA = false ;
         }
         else
         {
            if ( A3915EmpNumDec == 2 )
            {
               if ( DecimalUtil.compareTo((DecimalUtil.stringToDec("999999999.99").subtract(AV17PrdValConM)), DecimalUtil.stringToDec("999999999.99")) > 0 )
               {
                  A331DifValConA = DecimalUtil.stringToDec("999999999.99") ;
                  n331DifValConA = false ;
               }
               else
               {
                  A331DifValConA = DecimalUtil.stringToDec("999999999.99").subtract(AV17PrdValConM) ;
                  n331DifValConA = false ;
               }
            }
         }
         /* Using cursor P02XG4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n331DifValConA), A331DifValConA, A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPRDES");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pordprd1.this.A396EmprCod;
      this.aP1[0] = pordprd1.this.AV15Any;
      this.aP2[0] = pordprd1.this.AV16MesI;
      this.aP3[0] = pordprd1.this.AV18MesF;
      Application.commitDataStores(context, remoteHandle, pr_default, "pordprd1");
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
      P02XG2_A396EmprCod = new String[] {""} ;
      P02XG2_A681PrdAny = new short[1] ;
      P02XG2_A719PrdNum = new String[] {""} ;
      P02XG2_A3915EmpNumDec = new byte[1] ;
      P02XG2_n3915EmpNumDec = new boolean[] {false} ;
      P02XG2_A331DifValConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XG2_n331DifValConA = new boolean[] {false} ;
      A719PrdNum = "" ;
      A331DifValConA = DecimalUtil.ZERO ;
      AV17PrdValConM = DecimalUtil.ZERO ;
      P02XG3_A396EmprCod = new String[] {""} ;
      P02XG3_A719PrdNum = new String[] {""} ;
      P02XG3_A681PrdAny = new short[1] ;
      P02XG3_A720PrdNumMes = new byte[1] ;
      P02XG3_A747PrdValConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A747PrdValConM = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pordprd1__default(),
         new Object[] {
             new Object[] {
            P02XG2_A396EmprCod, P02XG2_A681PrdAny, P02XG2_A719PrdNum, P02XG2_A3915EmpNumDec, P02XG2_n3915EmpNumDec, P02XG2_A331DifValConA, P02XG2_n331DifValConA
            }
            , new Object[] {
            P02XG3_A396EmprCod, P02XG3_A719PrdNum, P02XG3_A681PrdAny, P02XG3_A720PrdNumMes, P02XG3_A747PrdValConM
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16MesI ;
   private byte AV18MesF ;
   private byte A3915EmpNumDec ;
   private byte A720PrdNumMes ;
   private short AV15Any ;
   private short A681PrdAny ;
   private short Gx_err ;
   private java.math.BigDecimal A331DifValConA ;
   private java.math.BigDecimal AV17PrdValConM ;
   private java.math.BigDecimal A747PrdValConM ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String Gx_msg ;
   private boolean n3915EmpNumDec ;
   private boolean n331DifValConA ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02XG2_A396EmprCod ;
   private short[] P02XG2_A681PrdAny ;
   private String[] P02XG2_A719PrdNum ;
   private byte[] P02XG2_A3915EmpNumDec ;
   private boolean[] P02XG2_n3915EmpNumDec ;
   private java.math.BigDecimal[] P02XG2_A331DifValConA ;
   private boolean[] P02XG2_n331DifValConA ;
   private String[] P02XG3_A396EmprCod ;
   private String[] P02XG3_A719PrdNum ;
   private short[] P02XG3_A681PrdAny ;
   private byte[] P02XG3_A720PrdNumMes ;
   private java.math.BigDecimal[] P02XG3_A747PrdValConM ;
}

final  class pordprd1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02XG2", "SELECT T1.EmprCod, T1.PrdAny, T1.PrdNum, T2.EmpNumDec, T1.DifValConA FROM (TXPCPRDES T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.EmprCod = ? and T1.PrdAny = ? ORDER BY T1.EmprCod, T1.PrdAny, T1.PrdNum  FOR UPDATE OF T1.DifValConA NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02XG3", "SELECT EmprCod, PrdNum, PrdAny, PrdNumMes, PrdValConM FROM TXPLPRDES WHERE (EmprCod = ? and PrdNum = ? and PrdAny = ? and PrdNumMes >= ?) AND (PrdNumMes <= ?) ORDER BY EmprCod, PrdNum, PrdAny, PrdNumMes ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02XG4", "UPDATE TXPCPRDES SET DifValConA=?  WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPRDES")
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

