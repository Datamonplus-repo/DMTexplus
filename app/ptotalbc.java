package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptotalbc extends GXProcedure
{
   public ptotalbc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptotalbc.class ), "" );
   }

   public ptotalbc( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 )
   {
      ptotalbc.this.aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        java.math.BigDecimal[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      ptotalbc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptotalbc.this.A14AlbComCod = aP1[0];
      this.aP1 = aP1;
      ptotalbc.this.AV8TotAlb = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8TotAlb = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P01JI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A21AlbComPre = P01JI2_A21AlbComPre[0] ;
         A13AlbComCnt = P01JI2_A13AlbComCnt[0] ;
         A20AlbComLin = P01JI2_A20AlbComLin[0] ;
         AV9ImpLinea = A13AlbComCnt.multiply(A21AlbComPre) ;
         AV8TotAlb = AV8TotAlb.add(AV9ImpLinea) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptotalbc.this.A396EmprCod;
      this.aP1[0] = ptotalbc.this.A14AlbComCod;
      this.aP2[0] = ptotalbc.this.AV8TotAlb;
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
      P01JI2_A396EmprCod = new String[] {""} ;
      P01JI2_A14AlbComCod = new int[1] ;
      P01JI2_A21AlbComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01JI2_A13AlbComCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01JI2_A20AlbComLin = new short[1] ;
      A21AlbComPre = DecimalUtil.ZERO ;
      A13AlbComCnt = DecimalUtil.ZERO ;
      AV9ImpLinea = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptotalbc__default(),
         new Object[] {
             new Object[] {
            P01JI2_A396EmprCod, P01JI2_A14AlbComCod, P01JI2_A21AlbComPre, P01JI2_A13AlbComCnt, P01JI2_A20AlbComLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A20AlbComLin ;
   private short Gx_err ;
   private int A14AlbComCod ;
   private java.math.BigDecimal AV8TotAlb ;
   private java.math.BigDecimal A21AlbComPre ;
   private java.math.BigDecimal A13AlbComCnt ;
   private java.math.BigDecimal AV9ImpLinea ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private java.math.BigDecimal[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01JI2_A396EmprCod ;
   private int[] P01JI2_A14AlbComCod ;
   private java.math.BigDecimal[] P01JI2_A21AlbComPre ;
   private java.math.BigDecimal[] P01JI2_A13AlbComCnt ;
   private short[] P01JI2_A20AlbComLin ;
}

final  class ptotalbc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01JI2", "SELECT EmprCod, AlbComCod, AlbComPre, AlbComCnt, AlbComLin FROM TXPLALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
      }
   }

}

