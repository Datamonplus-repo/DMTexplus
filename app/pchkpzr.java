package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pchkpzr extends GXProcedure
{
   public pchkpzr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pchkpzr.class ), "" );
   }

   public pchkpzr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           java.math.BigDecimal[] aP3 ,
                           java.math.BigDecimal[] aP4 ,
                           String[] aP5 )
   {
      pchkpzr.this.aP6 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        String[] aP5 ,
                        byte[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             String[] aP5 ,
                             byte[] aP6 )
   {
      pchkpzr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pchkpzr.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      pchkpzr.this.A2159AlbRecPie = aP2[0];
      this.aP2 = aP2;
      pchkpzr.this.AV16AlbRecKgm = aP3[0];
      this.aP3 = aP3;
      pchkpzr.this.AV17AlbRecMtr = aP4[0];
      this.aP4 = aP4;
      pchkpzr.this.AV18AlbRLoc = aP5[0];
      this.aP5 = aP5;
      pchkpzr.this.AV15FlagPie = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15FlagPie = (byte)(0) ;
      /* Using cursor P010W2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A56AlbRUni = P010W2_A56AlbRUni[0] ;
         A2156AlbRecKgmU = P010W2_A2156AlbRecKgmU[0] ;
         A2155AlbRecKgm = P010W2_A2155AlbRecKgm[0] ;
         A2157AlbRecMtr = P010W2_A2157AlbRecMtr[0] ;
         A2158AlbRecMtrU = P010W2_A2158AlbRecMtrU[0] ;
         A3731AlbRecIdPz = P010W2_A3731AlbRecIdPz[0] ;
         A56AlbRUni = P010W2_A56AlbRUni[0] ;
         AV15FlagPie = (byte)(1) ;
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            if ( DecimalUtil.compareTo(A2155AlbRecKgm, A2156AlbRecKgmU) < 0 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "No hay Kilos suficientes", ""));
            }
            else
            {
               AV16AlbRecKgm = A2155AlbRecKgm ;
               AV17AlbRecMtr = A2157AlbRecMtr ;
            }
         }
         else
         {
            if ( DecimalUtil.compareTo(A2155AlbRecKgm, A2156AlbRecKgmU) < 0 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "No hay Kilos suficientes", ""));
            }
            else
            {
               AV16AlbRecKgm = A2155AlbRecKgm ;
               AV17AlbRecMtr = A2157AlbRecMtr ;
            }
            if ( DecimalUtil.compareTo(A2157AlbRecMtr, A2158AlbRecMtrU) < 0 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "No hay Metros suficientes", ""));
            }
            else
            {
               AV16AlbRecKgm = A2155AlbRecKgm ;
               AV17AlbRecMtr = A2157AlbRecMtr ;
            }
         }
         AV18AlbRLoc = GXutil.substring( A3731AlbRecIdPz, 1, 10) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pchkpzr.this.A396EmprCod;
      this.aP1[0] = pchkpzr.this.A44AlbRecCod;
      this.aP2[0] = pchkpzr.this.A2159AlbRecPie;
      this.aP3[0] = pchkpzr.this.AV16AlbRecKgm;
      this.aP4[0] = pchkpzr.this.AV17AlbRecMtr;
      this.aP5[0] = pchkpzr.this.AV18AlbRLoc;
      this.aP6[0] = pchkpzr.this.AV15FlagPie;
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
      P010W2_A396EmprCod = new String[] {""} ;
      P010W2_A44AlbRecCod = new int[1] ;
      P010W2_A2159AlbRecPie = new String[] {""} ;
      P010W2_A56AlbRUni = new String[] {""} ;
      P010W2_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P010W2_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P010W2_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P010W2_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P010W2_A3731AlbRecIdPz = new String[] {""} ;
      A56AlbRUni = "" ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      A3731AlbRecIdPz = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pchkpzr__default(),
         new Object[] {
             new Object[] {
            P010W2_A396EmprCod, P010W2_A44AlbRecCod, P010W2_A2159AlbRecPie, P010W2_A56AlbRUni, P010W2_A2156AlbRecKgmU, P010W2_A2155AlbRecKgm, P010W2_A2157AlbRecMtr, P010W2_A2158AlbRecMtrU, P010W2_A3731AlbRecIdPz
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15FlagPie ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal AV16AlbRecKgm ;
   private java.math.BigDecimal AV17AlbRecMtr ;
   private java.math.BigDecimal A2156AlbRecKgmU ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private java.math.BigDecimal A2158AlbRecMtrU ;
   private String A396EmprCod ;
   private String A2159AlbRecPie ;
   private String AV18AlbRLoc ;
   private String scmdbuf ;
   private String A56AlbRUni ;
   private String A3731AlbRecIdPz ;
   private byte[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P010W2_A396EmprCod ;
   private int[] P010W2_A44AlbRecCod ;
   private String[] P010W2_A2159AlbRecPie ;
   private String[] P010W2_A56AlbRUni ;
   private java.math.BigDecimal[] P010W2_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] P010W2_A2155AlbRecKgm ;
   private java.math.BigDecimal[] P010W2_A2157AlbRecMtr ;
   private java.math.BigDecimal[] P010W2_A2158AlbRecMtrU ;
   private String[] P010W2_A3731AlbRecIdPz ;
}

final  class pchkpzr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P010W2", "SELECT T1.EmprCod, T1.AlbRecCod, T1.AlbRecPie, T2.AlbRUni, T1.AlbRecKgmU, T1.AlbRecKgm, T1.AlbRecMtr, T1.AlbRecMtrU, T1.AlbRecIdPz FROM (TXPALBDET T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? and T1.AlbRecPie = ? ORDER BY T1.EmprCod, T1.AlbRecCod, T1.AlbRecPie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 15);
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
               stmt.setString(3, (String)parms[2], 9);
               return;
      }
   }

}

