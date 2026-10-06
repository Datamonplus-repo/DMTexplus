package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pelisim extends GXProcedure
{
   public pelisim( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pelisim.class ), "" );
   }

   public pelisim( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           short[] aP2 ,
                           short[] aP3 ,
                           short[] aP4 )
   {
      pelisim.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 ,
                        short[] aP3 ,
                        short[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 ,
                             short[] aP3 ,
                             short[] aP4 ,
                             byte[] aP5 )
   {
      pelisim.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pelisim.this.A910Workstat = aP1[0];
      this.aP1 = aP1;
      pelisim.this.AV15RecLin = aP2[0];
      this.aP2 = aP2;
      pelisim.this.AV16RecLinIni = aP3[0];
      this.aP3 = aP3;
      pelisim.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      pelisim.this.A1273RecLinPro = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18Flag = (byte)(0) ;
      AV21RecLin2 = AV15RecLin ;
      AV22RecLinIni2 = AV16RecLinIni ;
      AV26Proc = GXutil.str( A1273RecLinPro, 2, 0) ;
      AV23RL = GXutil.str( AV15RecLin, 3, 0) ;
      AV23RL = GXutil.str( AV22RecLinIni2, 3, 0) ;
      AV27Contador = (byte)(0) ;
      /* Using cursor P00VD2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A910Workstat, Short.valueOf(AV16RecLinIni)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A887EscMLin = P00VD2_A887EscMLin[0] ;
         A890EscMCan = P00VD2_A890EscMCan[0] ;
         A719PrdNum = P00VD2_A719PrdNum[0] ;
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) && ( A890EscMCan.doubleValue() != 0 ) )
         {
            AV15RecLin = (short)(AV15RecLin-1) ;
            AV16RecLinIni = (short)(AV16RecLinIni-1) ;
         }
         else
         {
            AV16RecLinIni = AV15RecLin ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P00VD3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A910Workstat, Short.valueOf(AV22RecLinIni2)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A887EscMLin = P00VD3_A887EscMLin[0] ;
         A719PrdNum = P00VD3_A719PrdNum[0] ;
         A890EscMCan = P00VD3_A890EscMCan[0] ;
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), httpContext.getMessage( "C", "")) == 0 ) )
         {
            AV18Flag = (byte)(1) ;
            /* Using cursor P00VD4 */
            pr_default.execute(2, new Object[] {A396EmprCod, A910Workstat, Integer.valueOf(A887EscMLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPESCMAN");
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         else
         {
            if ( ( ! (GXutil.strcmp("", A719PrdNum)==0) && ( A890EscMCan.doubleValue() != 0 ) ) || ( GXutil.strcmp(A719PrdNum, "000000") == 0 ) )
            {
               AV18Flag = (byte)(1) ;
               /* Using cursor P00VD5 */
               pr_default.execute(3, new Object[] {A396EmprCod, A910Workstat, Integer.valueOf(A887EscMLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPESCMAN");
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pelisim.this.A396EmprCod;
      this.aP1[0] = pelisim.this.A910Workstat;
      this.aP2[0] = pelisim.this.AV15RecLin;
      this.aP3[0] = pelisim.this.AV16RecLinIni;
      this.aP4[0] = pelisim.this.A2804RecLinMaq;
      this.aP5[0] = pelisim.this.A1273RecLinPro;
      Application.commitDataStores(context, remoteHandle, pr_default, "pelisim");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV26Proc = "" ;
      AV23RL = "" ;
      scmdbuf = "" ;
      P00VD2_A396EmprCod = new String[] {""} ;
      P00VD2_A910Workstat = new String[] {""} ;
      P00VD2_A887EscMLin = new int[1] ;
      P00VD2_A890EscMCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00VD2_A719PrdNum = new String[] {""} ;
      A890EscMCan = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      P00VD3_A396EmprCod = new String[] {""} ;
      P00VD3_A910Workstat = new String[] {""} ;
      P00VD3_A887EscMLin = new int[1] ;
      P00VD3_A719PrdNum = new String[] {""} ;
      P00VD3_A890EscMCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pelisim__default(),
         new Object[] {
             new Object[] {
            P00VD2_A396EmprCod, P00VD2_A910Workstat, P00VD2_A887EscMLin, P00VD2_A890EscMCan, P00VD2_A719PrdNum
            }
            , new Object[] {
            P00VD3_A396EmprCod, P00VD3_A910Workstat, P00VD3_A887EscMLin, P00VD3_A719PrdNum, P00VD3_A890EscMCan
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

   private byte A1273RecLinPro ;
   private byte AV18Flag ;
   private byte AV27Contador ;
   private short AV15RecLin ;
   private short AV16RecLinIni ;
   private short A2804RecLinMaq ;
   private short AV21RecLin2 ;
   private short AV22RecLinIni2 ;
   private short Gx_err ;
   private int A887EscMLin ;
   private java.math.BigDecimal A890EscMCan ;
   private String A396EmprCod ;
   private String A910Workstat ;
   private String AV26Proc ;
   private String AV23RL ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private short[] aP2 ;
   private short[] aP3 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00VD2_A396EmprCod ;
   private String[] P00VD2_A910Workstat ;
   private int[] P00VD2_A887EscMLin ;
   private java.math.BigDecimal[] P00VD2_A890EscMCan ;
   private String[] P00VD2_A719PrdNum ;
   private String[] P00VD3_A396EmprCod ;
   private String[] P00VD3_A910Workstat ;
   private int[] P00VD3_A887EscMLin ;
   private String[] P00VD3_A719PrdNum ;
   private java.math.BigDecimal[] P00VD3_A890EscMCan ;
}

final  class pelisim__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00VD2", "SELECT EmprCod, Workstat, EscMLin, EscMCan, PrdNum FROM TXPESCMAN WHERE EmprCod = ? and Workstat = ? and EscMLin = ? ORDER BY EmprCod, Workstat, EscMLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00VD3", "SELECT EmprCod, Workstat, EscMLin, PrdNum, EscMCan FROM TXPESCMAN WHERE EmprCod = ? and Workstat = ? and EscMLin = ? ORDER BY EmprCod, Workstat, EscMLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00VD4", "DELETE FROM TXPESCMAN  WHERE EmprCod = ? AND Workstat = ? AND EscMLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPESCMAN")
         ,new UpdateCursor("P00VD5", "DELETE FROM TXPESCMAN  WHERE EmprCod = ? AND Workstat = ? AND EscMLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPESCMAN")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

