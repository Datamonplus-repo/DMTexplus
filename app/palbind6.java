package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palbind6 extends GXProcedure
{
   public palbind6( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palbind6.class ), "" );
   }

   public palbind6( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      palbind6.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      palbind6.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palbind6.this.AV18BarCod = aP1[0];
      this.aP1 = aP1;
      palbind6.this.AV19barCodReo = aP2[0];
      this.aP2 = aP2;
      palbind6.this.AV20BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01ZK2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19barCodReo), AV20BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P01ZK2_A130BarCodPar[0] ;
         A132BarCodReo = P01ZK2_A132BarCodReo[0] ;
         A129BarCod = P01ZK2_A129BarCod[0] ;
         A3746BarNPed = P01ZK2_A3746BarNPed[0] ;
         AV17PePCod = GXutil.lval( A3746BarNPed) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV17PePCod != 0 )
      {
         /* Execute user subroutine: 'CIERRA' */
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
      /* 'CIERRA' Routine */
      returnInSub = false ;
      /* Using cursor P01ZK3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(AV17PePCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A3814PePCod = P01ZK3_A3814PePCod[0] ;
         A3819PePMtPed = P01ZK3_A3819PePMtPed[0] ;
         n3819PePMtPed = P01ZK3_n3819PePMtPed[0] ;
         A3813PePSit = P01ZK3_A3813PePSit[0] ;
         n3813PePSit = P01ZK3_n3813PePSit[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = AV17PePCod ;
         GXv_decimal3[0] = AV23aux ;
         new app.ppepmte2(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_decimal3) ;
         palbind6.this.A396EmprCod = GXv_char1[0] ;
         palbind6.this.AV17PePCod = GXv_int2[0] ;
         palbind6.this.AV23aux = GXv_decimal3[0] ;
         if ( DecimalUtil.compareTo(AV23aux, A3819PePMtPed) >= 0 )
         {
            A3813PePSit = (byte)(2) ;
            n3813PePSit = false ;
         }
         else
         {
            A3813PePSit = (byte)(1) ;
            n3813PePSit = false ;
         }
         /* Using cursor P01ZK4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n3813PePSit), Byte.valueOf(A3813PePSit), A396EmprCod, Long.valueOf(A3814PePCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPedPro");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP0[0] = palbind6.this.A396EmprCod;
      this.aP1[0] = palbind6.this.AV18BarCod;
      this.aP2[0] = palbind6.this.AV19barCodReo;
      this.aP3[0] = palbind6.this.AV20BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "palbind6");
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
      P01ZK2_A396EmprCod = new String[] {""} ;
      P01ZK2_A130BarCodPar = new String[] {""} ;
      P01ZK2_A132BarCodReo = new byte[1] ;
      P01ZK2_A129BarCod = new int[1] ;
      P01ZK2_A3746BarNPed = new String[] {""} ;
      A130BarCodPar = "" ;
      A3746BarNPed = "" ;
      P01ZK3_A396EmprCod = new String[] {""} ;
      P01ZK3_A3814PePCod = new long[1] ;
      P01ZK3_A3819PePMtPed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01ZK3_n3819PePMtPed = new boolean[] {false} ;
      P01ZK3_A3813PePSit = new byte[1] ;
      P01ZK3_n3813PePSit = new boolean[] {false} ;
      A3819PePMtPed = DecimalUtil.ZERO ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new long[1] ;
      AV23aux = DecimalUtil.ZERO ;
      GXv_decimal3 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palbind6__default(),
         new Object[] {
             new Object[] {
            P01ZK2_A396EmprCod, P01ZK2_A130BarCodPar, P01ZK2_A132BarCodReo, P01ZK2_A129BarCod, P01ZK2_A3746BarNPed
            }
            , new Object[] {
            P01ZK3_A396EmprCod, P01ZK3_A3814PePCod, P01ZK3_A3819PePMtPed, P01ZK3_n3819PePMtPed, P01ZK3_A3813PePSit, P01ZK3_n3813PePSit
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19barCodReo ;
   private byte A132BarCodReo ;
   private byte A3813PePSit ;
   private short Gx_err ;
   private int AV18BarCod ;
   private int A129BarCod ;
   private long AV17PePCod ;
   private long A3814PePCod ;
   private long GXv_int2[] ;
   private java.math.BigDecimal A3819PePMtPed ;
   private java.math.BigDecimal AV23aux ;
   private java.math.BigDecimal GXv_decimal3[] ;
   private String A396EmprCod ;
   private String AV20BarCodPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A3746BarNPed ;
   private String GXv_char1[] ;
   private boolean returnInSub ;
   private boolean n3819PePMtPed ;
   private boolean n3813PePSit ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01ZK2_A396EmprCod ;
   private String[] P01ZK2_A130BarCodPar ;
   private byte[] P01ZK2_A132BarCodReo ;
   private int[] P01ZK2_A129BarCod ;
   private String[] P01ZK2_A3746BarNPed ;
   private String[] P01ZK3_A396EmprCod ;
   private long[] P01ZK3_A3814PePCod ;
   private java.math.BigDecimal[] P01ZK3_A3819PePMtPed ;
   private boolean[] P01ZK3_n3819PePMtPed ;
   private byte[] P01ZK3_A3813PePSit ;
   private boolean[] P01ZK3_n3813PePSit ;
}

final  class palbind6__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01ZK2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarNPed FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01ZK3", "SELECT EmprCod, PePCod, PePMtPed, PePSit FROM TXPPedPro WHERE EmprCod = ? and PePCod = ? ORDER BY EmprCod, PePCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01ZK4", "UPDATE TXPPedPro SET PePSit=?  WHERE EmprCod = ? AND PePCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPedPro")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setLong(3, ((Number) parms[3]).longValue());
               return;
      }
   }

}

