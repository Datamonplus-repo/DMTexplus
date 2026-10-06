package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdisald2 extends GXProcedure
{
   public pdisald2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdisald2.class ), "" );
   }

   public pdisald2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           int[] aP2 )
   {
      pdisald2.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        java.math.BigDecimal[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      pdisald2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdisald2.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      pdisald2.this.A44AlbRecCod = aP2[0];
      this.aP2 = aP2;
      pdisald2.this.AV9UniDis = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9UniDis = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P01YU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A392DisUniMed = P01YU2_A392DisUniMed[0] ;
         A382DisPieKil = P01YU2_A382DisPieKil[0] ;
         A384DisPieMet = P01YU2_A384DisPieMet[0] ;
         A380DisPieCod = P01YU2_A380DisPieCod[0] ;
         A392DisUniMed = P01YU2_A392DisUniMed[0] ;
         if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "K", "")) == 0 )
         {
            AV9UniDis = AV9UniDis.add(A382DisPieKil) ;
         }
         else
         {
            AV9UniDis = AV9UniDis.add(A384DisPieMet) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdisald2.this.A396EmprCod;
      this.aP1[0] = pdisald2.this.A361DisCod;
      this.aP2[0] = pdisald2.this.A44AlbRecCod;
      this.aP3[0] = pdisald2.this.AV9UniDis;
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
      P01YU2_A396EmprCod = new String[] {""} ;
      P01YU2_A361DisCod = new int[1] ;
      P01YU2_A44AlbRecCod = new int[1] ;
      P01YU2_A392DisUniMed = new String[] {""} ;
      P01YU2_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01YU2_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01YU2_A380DisPieCod = new String[] {""} ;
      A392DisUniMed = "" ;
      A382DisPieKil = DecimalUtil.ZERO ;
      A384DisPieMet = DecimalUtil.ZERO ;
      A380DisPieCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdisald2__default(),
         new Object[] {
             new Object[] {
            P01YU2_A396EmprCod, P01YU2_A361DisCod, P01YU2_A44AlbRecCod, P01YU2_A392DisUniMed, P01YU2_A382DisPieKil, P01YU2_A384DisPieMet, P01YU2_A380DisPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A361DisCod ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal AV9UniDis ;
   private java.math.BigDecimal A382DisPieKil ;
   private java.math.BigDecimal A384DisPieMet ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A392DisUniMed ;
   private String A380DisPieCod ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01YU2_A396EmprCod ;
   private int[] P01YU2_A361DisCod ;
   private int[] P01YU2_A44AlbRecCod ;
   private String[] P01YU2_A392DisUniMed ;
   private java.math.BigDecimal[] P01YU2_A382DisPieKil ;
   private java.math.BigDecimal[] P01YU2_A384DisPieMet ;
   private String[] P01YU2_A380DisPieCod ;
}

final  class pdisald2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01YU2", "SELECT T1.EmprCod, T1.DisCod, T1.AlbRecCod, T2.DisUniMed, T1.DisPieKil, T1.DisPieMet, T1.DisPieCod FROM (TXPDISALD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 9);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

