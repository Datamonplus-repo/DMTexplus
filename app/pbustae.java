package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbustae extends GXProcedure
{
   public pbustae( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbustae.class ), "" );
   }

   public pbustae( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 ,
                           java.math.BigDecimal[] aP5 )
   {
      pbustae.this.aP6 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        byte[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             byte[] aP6 )
   {
      pbustae.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbustae.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pbustae.this.A457FasCod = aP2[0];
      this.aP2 = aP2;
      pbustae.this.AV15PreExtSer = aP3[0];
      this.aP3 = aP3;
      pbustae.this.AV16PreExtNMtr = aP4[0];
      this.aP4 = aP4;
      pbustae.this.AV17PreExtPre = aP5[0];
      this.aP5 = aP5;
      pbustae.this.AV18OperEsp = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17PreExtPre = DecimalUtil.ZERO ;
      AV19Flag = (byte)(0) ;
      /* Using cursor P00EA2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A457FasCod, AV15PreExtSer, AV16PreExtNMtr});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2427PreExtNMtr = P00EA2_A2427PreExtNMtr[0] ;
         A2740PreExtSer = P00EA2_A2740PreExtSer[0] ;
         A2428PreExtPre = P00EA2_A2428PreExtPre[0] ;
         n2428PreExtPre = P00EA2_n2428PreExtPre[0] ;
         AV17PreExtPre = A2428PreExtPre ;
         AV19Flag = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( (0==AV19Flag) )
      {
         /* Using cursor P00EA3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A457FasCod, AV16PreExtNMtr});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2427PreExtNMtr = P00EA3_A2427PreExtNMtr[0] ;
            A2740PreExtSer = P00EA3_A2740PreExtSer[0] ;
            A2428PreExtPre = P00EA3_A2428PreExtPre[0] ;
            n2428PreExtPre = P00EA3_n2428PreExtPre[0] ;
            AV19Flag = (byte)(1) ;
            AV17PreExtPre = A2428PreExtPre ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      if ( (0==AV19Flag) )
      {
         /* Using cursor P00EA4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A457FasCod, AV15PreExtSer});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A2740PreExtSer = P00EA4_A2740PreExtSer[0] ;
            A2427PreExtNMtr = P00EA4_A2427PreExtNMtr[0] ;
            A2428PreExtPre = P00EA4_A2428PreExtPre[0] ;
            n2428PreExtPre = P00EA4_n2428PreExtPre[0] ;
            AV19Flag = (byte)(1) ;
            AV17PreExtPre = A2428PreExtPre ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV17PreExtPre)==0) )
      {
         AV18OperEsp = (byte)(2) ;
      }
      else
      {
         AV18OperEsp = (byte)(10) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbustae.this.A396EmprCod;
      this.aP1[0] = pbustae.this.A252CliCod;
      this.aP2[0] = pbustae.this.A457FasCod;
      this.aP3[0] = pbustae.this.AV15PreExtSer;
      this.aP4[0] = pbustae.this.AV16PreExtNMtr;
      this.aP5[0] = pbustae.this.AV17PreExtPre;
      this.aP6[0] = pbustae.this.AV18OperEsp;
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
      P00EA2_A396EmprCod = new String[] {""} ;
      P00EA2_A252CliCod = new int[1] ;
      P00EA2_A457FasCod = new String[] {""} ;
      P00EA2_A2427PreExtNMtr = new String[] {""} ;
      P00EA2_A2740PreExtSer = new String[] {""} ;
      P00EA2_A2428PreExtPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00EA2_n2428PreExtPre = new boolean[] {false} ;
      A2427PreExtNMtr = "" ;
      A2740PreExtSer = "" ;
      A2428PreExtPre = DecimalUtil.ZERO ;
      P00EA3_A396EmprCod = new String[] {""} ;
      P00EA3_A252CliCod = new int[1] ;
      P00EA3_A457FasCod = new String[] {""} ;
      P00EA3_A2427PreExtNMtr = new String[] {""} ;
      P00EA3_A2740PreExtSer = new String[] {""} ;
      P00EA3_A2428PreExtPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00EA3_n2428PreExtPre = new boolean[] {false} ;
      P00EA4_A396EmprCod = new String[] {""} ;
      P00EA4_A252CliCod = new int[1] ;
      P00EA4_A457FasCod = new String[] {""} ;
      P00EA4_A2740PreExtSer = new String[] {""} ;
      P00EA4_A2427PreExtNMtr = new String[] {""} ;
      P00EA4_A2428PreExtPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00EA4_n2428PreExtPre = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbustae__default(),
         new Object[] {
             new Object[] {
            P00EA2_A396EmprCod, P00EA2_A252CliCod, P00EA2_A457FasCod, P00EA2_A2427PreExtNMtr, P00EA2_A2740PreExtSer, P00EA2_A2428PreExtPre, P00EA2_n2428PreExtPre
            }
            , new Object[] {
            P00EA3_A396EmprCod, P00EA3_A252CliCod, P00EA3_A457FasCod, P00EA3_A2427PreExtNMtr, P00EA3_A2740PreExtSer, P00EA3_A2428PreExtPre, P00EA3_n2428PreExtPre
            }
            , new Object[] {
            P00EA4_A396EmprCod, P00EA4_A252CliCod, P00EA4_A457FasCod, P00EA4_A2740PreExtSer, P00EA4_A2427PreExtNMtr, P00EA4_A2428PreExtPre, P00EA4_n2428PreExtPre
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18OperEsp ;
   private byte AV19Flag ;
   private short Gx_err ;
   private int A252CliCod ;
   private java.math.BigDecimal AV17PreExtPre ;
   private java.math.BigDecimal A2428PreExtPre ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String AV15PreExtSer ;
   private String AV16PreExtNMtr ;
   private String scmdbuf ;
   private String A2427PreExtNMtr ;
   private String A2740PreExtSer ;
   private boolean n2428PreExtPre ;
   private byte[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00EA2_A396EmprCod ;
   private int[] P00EA2_A252CliCod ;
   private String[] P00EA2_A457FasCod ;
   private String[] P00EA2_A2427PreExtNMtr ;
   private String[] P00EA2_A2740PreExtSer ;
   private java.math.BigDecimal[] P00EA2_A2428PreExtPre ;
   private boolean[] P00EA2_n2428PreExtPre ;
   private String[] P00EA3_A396EmprCod ;
   private int[] P00EA3_A252CliCod ;
   private String[] P00EA3_A457FasCod ;
   private String[] P00EA3_A2427PreExtNMtr ;
   private String[] P00EA3_A2740PreExtSer ;
   private java.math.BigDecimal[] P00EA3_A2428PreExtPre ;
   private boolean[] P00EA3_n2428PreExtPre ;
   private String[] P00EA4_A396EmprCod ;
   private int[] P00EA4_A252CliCod ;
   private String[] P00EA4_A457FasCod ;
   private String[] P00EA4_A2740PreExtSer ;
   private String[] P00EA4_A2427PreExtNMtr ;
   private java.math.BigDecimal[] P00EA4_A2428PreExtPre ;
   private boolean[] P00EA4_n2428PreExtPre ;
}

final  class pbustae__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00EA2", "SELECT EmprCod, CliCod, FasCod, PreExtNMtr, PreExtSer, PreExtPre FROM TXPPREEXT WHERE EmprCod = ? and CliCod = ? and FasCod = ? and PreExtSer = ? and PreExtNMtr = ? ORDER BY EmprCod, CliCod, FasCod, PreExtSer, PreExtNMtr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00EA3", "SELECT EmprCod, CliCod, FasCod, PreExtNMtr, PreExtSer, PreExtPre FROM TXPPREEXT WHERE (EmprCod = ? and CliCod = ? and FasCod = ?) AND ((rtrim(PreExtSer) IS NULL AND NOT(PreExtSer IS NULL))) AND (PreExtNMtr = ?) ORDER BY EmprCod, CliCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00EA4", "SELECT EmprCod, CliCod, FasCod, PreExtSer, PreExtNMtr, PreExtPre FROM TXPPREEXT WHERE (EmprCod = ? and CliCod = ? and FasCod = ? and PreExtSer = ?) AND ((rtrim(PreExtNMtr) IS NULL AND NOT(PreExtNMtr IS NULL))) ORDER BY EmprCod, CliCod, FasCod, PreExtSer ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 10);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 10);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               return;
      }
   }

}

