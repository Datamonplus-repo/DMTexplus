package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prcnc03 extends GXProcedure
{
   public prcnc03( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prcnc03.class ), "" );
   }

   public prcnc03( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           long[] aP4 )
   {
      prcnc03.this.aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        long[] aP4 ,
                        java.math.BigDecimal[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             long[] aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      prcnc03.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prcnc03.this.AV8Barcod = aP1[0];
      this.aP1 = aP1;
      prcnc03.this.AV9Barcodreo = aP2[0];
      this.aP2 = aP2;
      prcnc03.this.AV10Barcodpar = aP3[0];
      this.aP3 = aP3;
      prcnc03.this.AV11AlbProcod = aP4[0];
      this.aP4 = aP4;
      prcnc03.this.AV12BarAlbKgme = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04182 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8Barcod), Byte.valueOf(AV9Barcodreo), AV10Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10718RcNcHd = P04182_A10718RcNcHd[0] ;
         n10718RcNcHd = P04182_n10718RcNcHd[0] ;
         A10719RcNcR = P04182_A10719RcNcR[0] ;
         n10719RcNcR = P04182_n10719RcNcR[0] ;
         A10720RcNcP = P04182_A10720RcNcP[0] ;
         n10720RcNcP = P04182_n10720RcNcP[0] ;
         A10717RcNcLin = P04182_A10717RcNcLin[0] ;
         A10715RcNcFec = P04182_A10715RcNcFec[0] ;
         W396EmprCod = A396EmprCod ;
         /*
            INSERT RECORD ON TABLE TXPRCNC02

         */
         W396EmprCod = A396EmprCod ;
         W10715RcNcFec = A10715RcNcFec ;
         W10717RcNcLin = A10717RcNcLin ;
         A10813RcNcGrn = AV11AlbProcod ;
         A10848RcNcKgG = AV12BarAlbKgme ;
         n10848RcNcKgG = false ;
         /* Using cursor P04183 */
         pr_default.execute(1, new Object[] {A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin), Long.valueOf(A10813RcNcGrn), Boolean.valueOf(n10848RcNcKgG), A10848RcNcKgG});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRCNC02");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A10715RcNcFec = W10715RcNcFec ;
         A10717RcNcLin = W10717RcNcLin ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prcnc03.this.A396EmprCod;
      this.aP1[0] = prcnc03.this.AV8Barcod;
      this.aP2[0] = prcnc03.this.AV9Barcodreo;
      this.aP3[0] = prcnc03.this.AV10Barcodpar;
      this.aP4[0] = prcnc03.this.AV11AlbProcod;
      this.aP5[0] = prcnc03.this.AV12BarAlbKgme;
      Application.commitDataStores(context, remoteHandle, pr_default, "prcnc03");
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
      P04182_A396EmprCod = new String[] {""} ;
      P04182_A10718RcNcHd = new int[1] ;
      P04182_n10718RcNcHd = new boolean[] {false} ;
      P04182_A10719RcNcR = new byte[1] ;
      P04182_n10719RcNcR = new boolean[] {false} ;
      P04182_A10720RcNcP = new String[] {""} ;
      P04182_n10720RcNcP = new boolean[] {false} ;
      P04182_A10717RcNcLin = new int[1] ;
      P04182_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      A10720RcNcP = "" ;
      A10715RcNcFec = GXutil.nullDate() ;
      W396EmprCod = "" ;
      W10715RcNcFec = GXutil.nullDate() ;
      A10848RcNcKgG = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prcnc03__default(),
         new Object[] {
             new Object[] {
            P04182_A396EmprCod, P04182_A10718RcNcHd, P04182_n10718RcNcHd, P04182_A10719RcNcR, P04182_n10719RcNcR, P04182_A10720RcNcP, P04182_n10720RcNcP, P04182_A10717RcNcLin, P04182_A10715RcNcFec
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9Barcodreo ;
   private byte A10719RcNcR ;
   private short Gx_err ;
   private int AV8Barcod ;
   private int A10718RcNcHd ;
   private int A10717RcNcLin ;
   private int GX_INS1439 ;
   private int W10717RcNcLin ;
   private long AV11AlbProcod ;
   private long A10813RcNcGrn ;
   private java.math.BigDecimal AV12BarAlbKgme ;
   private java.math.BigDecimal A10848RcNcKgG ;
   private String A396EmprCod ;
   private String AV10Barcodpar ;
   private String scmdbuf ;
   private String A10720RcNcP ;
   private String W396EmprCod ;
   private String Gx_emsg ;
   private java.util.Date A10715RcNcFec ;
   private java.util.Date W10715RcNcFec ;
   private boolean n10718RcNcHd ;
   private boolean n10719RcNcR ;
   private boolean n10720RcNcP ;
   private boolean n10848RcNcKgG ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private long[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04182_A396EmprCod ;
   private int[] P04182_A10718RcNcHd ;
   private boolean[] P04182_n10718RcNcHd ;
   private byte[] P04182_A10719RcNcR ;
   private boolean[] P04182_n10719RcNcR ;
   private String[] P04182_A10720RcNcP ;
   private boolean[] P04182_n10720RcNcP ;
   private int[] P04182_A10717RcNcLin ;
   private java.util.Date[] P04182_A10715RcNcFec ;
}

final  class prcnc03__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04182", "SELECT EmprCod, RcNcHd, RcNcR, RcNcP, RcNcLin, RcNcFec FROM TXPRCNC01 WHERE EmprCod = ? and RcNcHd = ? and RcNcR = ? and RcNcP = ? ORDER BY EmprCod, RcNcHd, RcNcR, RcNcP ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04183", "INSERT INTO TXPRCNC02(EmprCod, RcNcFec, RcNcLin, RcNcGrn, RcNcKgG) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRCNC02")
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(6);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               }
               return;
      }
   }

}

