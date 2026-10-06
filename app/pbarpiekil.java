package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbarpiekil extends GXProcedure
{
   public pbarpiekil( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbarpiekil.class ), "" );
   }

   public pbarpiekil( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           String[] aP4 )
   {
      pbarpiekil.this.aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      pbarpiekil.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbarpiekil.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pbarpiekil.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pbarpiekil.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pbarpiekil.this.A200BarPieCod = aP4[0];
      this.aP4 = aP4;
      pbarpiekil.this.AV8BarPieKil = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01MH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A203BarPieKil = P01MH2_A203BarPieKil[0] ;
         AV8BarPieKil = A203BarPieKil ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbarpiekil.this.A396EmprCod;
      this.aP1[0] = pbarpiekil.this.A129BarCod;
      this.aP2[0] = pbarpiekil.this.A132BarCodReo;
      this.aP3[0] = pbarpiekil.this.A130BarCodPar;
      this.aP4[0] = pbarpiekil.this.A200BarPieCod;
      this.aP5[0] = pbarpiekil.this.AV8BarPieKil;
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
      P01MH2_A396EmprCod = new String[] {""} ;
      P01MH2_A129BarCod = new int[1] ;
      P01MH2_A132BarCodReo = new byte[1] ;
      P01MH2_A130BarCodPar = new String[] {""} ;
      P01MH2_A200BarPieCod = new String[] {""} ;
      P01MH2_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A203BarPieKil = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbarpiekil__default(),
         new Object[] {
             new Object[] {
            P01MH2_A396EmprCod, P01MH2_A129BarCod, P01MH2_A132BarCodReo, P01MH2_A130BarCodPar, P01MH2_A200BarPieCod, P01MH2_A203BarPieKil
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal AV8BarPieKil ;
   private java.math.BigDecimal A203BarPieKil ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String scmdbuf ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P01MH2_A396EmprCod ;
   private int[] P01MH2_A129BarCod ;
   private byte[] P01MH2_A132BarCodReo ;
   private String[] P01MH2_A130BarCodPar ;
   private String[] P01MH2_A200BarPieCod ;
   private java.math.BigDecimal[] P01MH2_A203BarPieKil ;
}

final  class pbarpiekil__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01MH2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarPieKil FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
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
               stmt.setString(5, (String)parms[4], 9);
               return;
      }
   }

}

