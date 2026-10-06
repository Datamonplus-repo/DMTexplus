package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdisaln2 extends GXProcedure
{
   public pdisaln2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdisaln2.class ), "" );
   }

   public pdisaln2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           java.math.BigDecimal[] aP2 )
   {
      pdisaln2.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      pdisaln2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdisaln2.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      pdisaln2.this.AV13Kilos = aP2[0];
      this.aP2 = aP2;
      pdisaln2.this.AV9DisPieKgm = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01642 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A365DisDes = P01642_A365DisDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
         {
            A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
         }
         else
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
            }
            else
            {
               A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
            }
         }
         AV9DisPieKgm = A381DisPieKgm.add(AV13Kilos) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdisaln2.this.A396EmprCod;
      this.aP1[0] = pdisaln2.this.A361DisCod;
      this.aP2[0] = pdisaln2.this.AV13Kilos;
      this.aP3[0] = pdisaln2.this.AV9DisPieKgm;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public java.math.BigDecimal getDisPieKgm1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X595Kilos = DecimalUtil.ZERO ;
      /* Using cursor P01643 */
      pr_default.execute(1, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         X595Kilos = P01643_A595Kilos[0] ;
      }
      pr_default.close(1);
      return X595Kilos ;
   }

   public java.math.BigDecimal getDisPieKgm0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X382DisPieKil = DecimalUtil.ZERO ;
      /* Using cursor P01644 */
      pr_default.execute(2, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         X382DisPieKil = P01644_A382DisPieKil[0] ;
      }
      pr_default.close(2);
      return X382DisPieKil ;
   }

   public void initialize( )
   {
      scmdbuf = "" ;
      P01642_A396EmprCod = new String[] {""} ;
      P01642_A361DisCod = new int[1] ;
      P01642_A365DisDes = new String[] {""} ;
      A365DisDes = "" ;
      A381DisPieKgm = DecimalUtil.ZERO ;
      X595Kilos = DecimalUtil.ZERO ;
      P01643_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X382DisPieKil = DecimalUtil.ZERO ;
      P01644_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdisaln2__default(),
         new Object[] {
             new Object[] {
            P01642_A396EmprCod, P01642_A361DisCod, P01642_A365DisDes
            }
            , new Object[] {
            P01643_A595Kilos
            }
            , new Object[] {
            P01644_A382DisPieKil
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A361DisCod ;
   private int E361DisCod ;
   private java.math.BigDecimal AV13Kilos ;
   private java.math.BigDecimal AV9DisPieKgm ;
   private java.math.BigDecimal A381DisPieKgm ;
   private java.math.BigDecimal X595Kilos ;
   private java.math.BigDecimal X382DisPieKil ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A365DisDes ;
   private String E396EmprCod ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01642_A396EmprCod ;
   private int[] P01642_A361DisCod ;
   private String[] P01642_A365DisDes ;
   private java.math.BigDecimal[] P01643_A595Kilos ;
   private java.math.BigDecimal[] P01644_A382DisPieKil ;
}

final  class pdisaln2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01642", "SELECT EmprCod, DisCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01643", "SELECT SUM(Kilos) AS GXC2 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01644", "SELECT SUM(DisPieKil) AS GXC1 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

