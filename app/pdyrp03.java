package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdyrp03 extends GXProcedure
{
   public pdyrp03( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdyrp03.class ), "" );
   }

   public pdyrp03( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           java.math.BigDecimal[] aP2 )
   {
      pdyrp03.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             byte[] aP3 )
   {
      pdyrp03.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdyrp03.this.AV15NumPrd = aP1[0];
      this.aP1 = aP1;
      pdyrp03.this.AV13CanTeo = aP2[0];
      this.aP2 = aP2;
      pdyrp03.this.AV12FlagExis2 = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17Consumos = (byte)(0) ;
      GXv_int1[0] = AV17Consumos ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, "011100", GXv_int1) ;
      pdyrp03.this.AV17Consumos = (byte)((byte)(GXv_int1[0])) ;
      AV16TeoCant = AV13CanTeo ;
      AV12FlagExis2 = (byte)(0) ;
      AV14ExiRes = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P099A2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV15NumPrd});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P099A2_A719PrdNum[0] ;
         A678PrdAltFac = P099A2_A678PrdAltFac[0] ;
         A680PrdAltNum = P099A2_A680PrdAltNum[0] ;
         AV16TeoCant = AV16TeoCant.multiply(A678PrdAltFac) ;
         AV19PrdALtNum = A680PrdAltNum ;
         /* Execute user subroutine: 'PRODUC' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( DecimalUtil.compareTo(AV14ExiRes, AV16TeoCant) >= 0 )
         {
            AV12FlagExis2 = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'PRODUC' Routine */
      returnInSub = false ;
      /* Using cursor P099A3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV19PrdALtNum});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A719PrdNum = P099A3_A719PrdNum[0] ;
         A705PrdExiCC = P099A3_A705PrdExiCC[0] ;
         A704PrdExiAlm = P099A3_A704PrdExiAlm[0] ;
         A856ValCod = P099A3_A856ValCod[0] ;
         A685PrdCanRes = P099A3_A685PrdCanRes[0] ;
         if ( AV17Consumos == 0 )
         {
            AV18Existencia = A705PrdExiCC ;
         }
         else
         {
            AV18Existencia = A704PrdExiAlm ;
         }
         if ( ( A856ValCod == 1 ) && ( AV18Existencia.doubleValue() > 0 ) )
         {
            AV14ExiRes = AV18Existencia.subtract(A685PrdCanRes) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdyrp03.this.A396EmprCod;
      this.aP1[0] = pdyrp03.this.AV15NumPrd;
      this.aP2[0] = pdyrp03.this.AV13CanTeo;
      this.aP3[0] = pdyrp03.this.AV12FlagExis2;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new int[1] ;
      AV16TeoCant = DecimalUtil.ZERO ;
      AV14ExiRes = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P099A2_A396EmprCod = new String[] {""} ;
      P099A2_A719PrdNum = new String[] {""} ;
      P099A2_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P099A2_A680PrdAltNum = new String[] {""} ;
      A719PrdNum = "" ;
      A678PrdAltFac = DecimalUtil.ZERO ;
      A680PrdAltNum = "" ;
      AV19PrdALtNum = "" ;
      P099A3_A396EmprCod = new String[] {""} ;
      P099A3_A719PrdNum = new String[] {""} ;
      P099A3_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P099A3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P099A3_A856ValCod = new byte[1] ;
      P099A3_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      AV18Existencia = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdyrp03__default(),
         new Object[] {
             new Object[] {
            P099A2_A396EmprCod, P099A2_A719PrdNum, P099A2_A678PrdAltFac, P099A2_A680PrdAltNum
            }
            , new Object[] {
            P099A3_A396EmprCod, P099A3_A719PrdNum, P099A3_A705PrdExiCC, P099A3_A704PrdExiAlm, P099A3_A856ValCod, P099A3_A685PrdCanRes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12FlagExis2 ;
   private byte AV17Consumos ;
   private byte A856ValCod ;
   private short Gx_err ;
   private int GXv_int1[] ;
   private java.math.BigDecimal AV13CanTeo ;
   private java.math.BigDecimal AV16TeoCant ;
   private java.math.BigDecimal AV14ExiRes ;
   private java.math.BigDecimal A678PrdAltFac ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal AV18Existencia ;
   private String A396EmprCod ;
   private String AV15NumPrd ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A680PrdAltNum ;
   private String AV19PrdALtNum ;
   private boolean returnInSub ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P099A2_A396EmprCod ;
   private String[] P099A2_A719PrdNum ;
   private java.math.BigDecimal[] P099A2_A678PrdAltFac ;
   private String[] P099A2_A680PrdAltNum ;
   private String[] P099A3_A396EmprCod ;
   private String[] P099A3_A719PrdNum ;
   private java.math.BigDecimal[] P099A3_A705PrdExiCC ;
   private java.math.BigDecimal[] P099A3_A704PrdExiAlm ;
   private byte[] P099A3_A856ValCod ;
   private java.math.BigDecimal[] P099A3_A685PrdCanRes ;
}

final  class pdyrp03__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P099A2", "SELECT EmprCod, PrdNum, PrdAltFac, PrdAltNum FROM TXPPRDALT WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P099A3", "SELECT EmprCod, PrdNum, PrdExiCC, PrdExiAlm, ValCod, PrdCanRes FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

