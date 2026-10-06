package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phojrep extends GXProcedure
{
   public phojrep( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phojrep.class ), "" );
   }

   public phojrep( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           byte[] aP4 ,
                           String[] aP5 ,
                           String[] aP6 ,
                           java.math.BigDecimal[] aP7 )
   {
      phojrep.this.aP8 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        byte[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             byte[] aP8 )
   {
      phojrep.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phojrep.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      phojrep.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      phojrep.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      phojrep.this.A2524DisComLin = aP4[0];
      this.aP4 = aP4;
      phojrep.this.A1056DisComCod = aP5[0];
      this.aP5 = aP5;
      phojrep.this.A1032FonCod = aP6[0];
      this.aP6 = aP6;
      phojrep.this.AV15BarComMtr = aP7[0];
      this.aP7 = aP7;
      phojrep.this.AV16Flag = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Flag = (byte)(0) ;
      /* Using cursor P00ZH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2069BarComEst = P00ZH2_A2069BarComEst[0] ;
         n2069BarComEst = P00ZH2_n2069BarComEst[0] ;
         A1541BarComMtr = P00ZH2_A1541BarComMtr[0] ;
         n1541BarComMtr = P00ZH2_n1541BarComMtr[0] ;
         if ( GXutil.strcmp(A2069BarComEst, httpContext.getMessage( "N", "")) == 0 )
         {
            AV15BarComMtr = A1541BarComMtr ;
            A2069BarComEst = httpContext.getMessage( "B", "") ;
            n2069BarComEst = false ;
         }
         else
         {
            if ( GXutil.strcmp(A2069BarComEst, httpContext.getMessage( "S", "")) == 0 )
            {
               AV16Flag = (byte)(2) ;
            }
            else
            {
               if ( GXutil.strcmp(A2069BarComEst, httpContext.getMessage( "B", "")) == 0 )
               {
                  AV16Flag = (byte)(3) ;
               }
            }
         }
         AV16Flag = (byte)(1) ;
         /* Using cursor P00ZH3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n2069BarComEst), A2069BarComEst, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCOM");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phojrep.this.A396EmprCod;
      this.aP1[0] = phojrep.this.A129BarCod;
      this.aP2[0] = phojrep.this.A132BarCodReo;
      this.aP3[0] = phojrep.this.A130BarCodPar;
      this.aP4[0] = phojrep.this.A2524DisComLin;
      this.aP5[0] = phojrep.this.A1056DisComCod;
      this.aP6[0] = phojrep.this.A1032FonCod;
      this.aP7[0] = phojrep.this.AV15BarComMtr;
      this.aP8[0] = phojrep.this.AV16Flag;
      Application.commitDataStores(context, remoteHandle, pr_default, "phojrep");
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
      P00ZH2_A396EmprCod = new String[] {""} ;
      P00ZH2_A129BarCod = new int[1] ;
      P00ZH2_A132BarCodReo = new byte[1] ;
      P00ZH2_A130BarCodPar = new String[] {""} ;
      P00ZH2_A2524DisComLin = new byte[1] ;
      P00ZH2_A1056DisComCod = new String[] {""} ;
      P00ZH2_A1032FonCod = new String[] {""} ;
      P00ZH2_A2069BarComEst = new String[] {""} ;
      P00ZH2_n2069BarComEst = new boolean[] {false} ;
      P00ZH2_A1541BarComMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ZH2_n1541BarComMtr = new boolean[] {false} ;
      A2069BarComEst = "" ;
      A1541BarComMtr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phojrep__default(),
         new Object[] {
             new Object[] {
            P00ZH2_A396EmprCod, P00ZH2_A129BarCod, P00ZH2_A132BarCodReo, P00ZH2_A130BarCodPar, P00ZH2_A2524DisComLin, P00ZH2_A1056DisComCod, P00ZH2_A1032FonCod, P00ZH2_A2069BarComEst, P00ZH2_n2069BarComEst, P00ZH2_A1541BarComMtr,
            P00ZH2_n1541BarComMtr
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A2524DisComLin ;
   private byte AV16Flag ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal AV15BarComMtr ;
   private java.math.BigDecimal A1541BarComMtr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private String scmdbuf ;
   private String A2069BarComEst ;
   private boolean n2069BarComEst ;
   private boolean n1541BarComMtr ;
   private byte[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P00ZH2_A396EmprCod ;
   private int[] P00ZH2_A129BarCod ;
   private byte[] P00ZH2_A132BarCodReo ;
   private String[] P00ZH2_A130BarCodPar ;
   private byte[] P00ZH2_A2524DisComLin ;
   private String[] P00ZH2_A1056DisComCod ;
   private String[] P00ZH2_A1032FonCod ;
   private String[] P00ZH2_A2069BarComEst ;
   private boolean[] P00ZH2_n2069BarComEst ;
   private java.math.BigDecimal[] P00ZH2_A1541BarComMtr ;
   private boolean[] P00ZH2_n1541BarComMtr ;
}

final  class phojrep__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00ZH2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, BarComEst, BarComMtr FROM TXPBARCOM WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00ZH3", "UPDATE TXPBARCOM SET BarComEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCOM")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setString(7, (String)parms[7], 12);
               stmt.setString(8, (String)parms[8], 12);
               return;
      }
   }

}

