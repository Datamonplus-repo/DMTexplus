package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodesp extends GXProcedure
{
   public pmodesp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodesp.class ), "" );
   }

   public pmodesp( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 )
   {
      pmodesp.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      pmodesp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmodesp.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pmodesp.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pmodesp.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pmodesp.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "pMODESP", "") );
      /* Using cursor P00ZQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A32AlbProEsp = P00ZQ2_A32AlbProEsp[0] ;
         AV15Flag = (byte)(0) ;
         /* Using cursor P00ZQ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1536AlbEComPre = P00ZQ3_A1536AlbEComPre[0] ;
            n1536AlbEComPre = P00ZQ3_n1536AlbEComPre[0] ;
            A1032FonCod = P00ZQ3_A1032FonCod[0] ;
            A1056DisComCod = P00ZQ3_A1056DisComCod[0] ;
            A2524DisComLin = P00ZQ3_A2524DisComLin[0] ;
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A1536AlbEComPre)==0) )
            {
               AV15Flag = (byte)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV15Flag == 1 )
         {
            A32AlbProEsp = (byte)(1) ;
         }
         /* Using cursor P00ZQ4 */
         pr_default.execute(2, new Object[] {Byte.valueOf(A32AlbProEsp), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodesp.this.A396EmprCod;
      this.aP1[0] = pmodesp.this.A30AlbProCod;
      this.aP2[0] = pmodesp.this.A129BarCod;
      this.aP3[0] = pmodesp.this.A132BarCodReo;
      this.aP4[0] = pmodesp.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmodesp");
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
      P00ZQ2_A396EmprCod = new String[] {""} ;
      P00ZQ2_A30AlbProCod = new long[1] ;
      P00ZQ2_A129BarCod = new int[1] ;
      P00ZQ2_A132BarCodReo = new byte[1] ;
      P00ZQ2_A130BarCodPar = new String[] {""} ;
      P00ZQ2_A32AlbProEsp = new byte[1] ;
      P00ZQ3_A396EmprCod = new String[] {""} ;
      P00ZQ3_A30AlbProCod = new long[1] ;
      P00ZQ3_A129BarCod = new int[1] ;
      P00ZQ3_A132BarCodReo = new byte[1] ;
      P00ZQ3_A130BarCodPar = new String[] {""} ;
      P00ZQ3_A1536AlbEComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ZQ3_n1536AlbEComPre = new boolean[] {false} ;
      P00ZQ3_A1032FonCod = new String[] {""} ;
      P00ZQ3_A1056DisComCod = new String[] {""} ;
      P00ZQ3_A2524DisComLin = new byte[1] ;
      A1536AlbEComPre = DecimalUtil.ZERO ;
      A1032FonCod = "" ;
      A1056DisComCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodesp__default(),
         new Object[] {
             new Object[] {
            P00ZQ2_A396EmprCod, P00ZQ2_A30AlbProCod, P00ZQ2_A129BarCod, P00ZQ2_A132BarCodReo, P00ZQ2_A130BarCodPar, P00ZQ2_A32AlbProEsp
            }
            , new Object[] {
            P00ZQ3_A396EmprCod, P00ZQ3_A30AlbProCod, P00ZQ3_A129BarCod, P00ZQ3_A132BarCodReo, P00ZQ3_A130BarCodPar, P00ZQ3_A1536AlbEComPre, P00ZQ3_n1536AlbEComPre, P00ZQ3_A1032FonCod, P00ZQ3_A1056DisComCod, P00ZQ3_A2524DisComLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A32AlbProEsp ;
   private byte AV15Flag ;
   private byte A2524DisComLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1536AlbEComPre ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A1032FonCod ;
   private String A1056DisComCod ;
   private boolean n1536AlbEComPre ;
   private String[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00ZQ2_A396EmprCod ;
   private long[] P00ZQ2_A30AlbProCod ;
   private int[] P00ZQ2_A129BarCod ;
   private byte[] P00ZQ2_A132BarCodReo ;
   private String[] P00ZQ2_A130BarCodPar ;
   private byte[] P00ZQ2_A32AlbProEsp ;
   private String[] P00ZQ3_A396EmprCod ;
   private long[] P00ZQ3_A30AlbProCod ;
   private int[] P00ZQ3_A129BarCod ;
   private byte[] P00ZQ3_A132BarCodReo ;
   private String[] P00ZQ3_A130BarCodPar ;
   private java.math.BigDecimal[] P00ZQ3_A1536AlbEComPre ;
   private boolean[] P00ZQ3_n1536AlbEComPre ;
   private String[] P00ZQ3_A1032FonCod ;
   private String[] P00ZQ3_A1056DisComCod ;
   private byte[] P00ZQ3_A2524DisComLin ;
}

final  class pmodesp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00ZQ2", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbProEsp FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00ZQ3", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbEComPre, FonCod, DisComCod, DisComLin FROM TXPALBEST WHERE (EmprCod = ?) AND (AlbProCod = ?) AND (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) ORDER BY DisComCod, FonCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00ZQ4", "UPDATE TXPALBBAR SET AlbProEsp=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 12);
               ((String[]) buf[8])[0] = rslt.getString(8, 12);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

