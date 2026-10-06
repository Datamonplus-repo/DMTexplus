package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvolfrb extends GXProcedure
{
   public pvolfrb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvolfrb.class ), "" );
   }

   public pvolfrb( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          short[] aP4 ,
                          java.math.BigDecimal[] aP5 )
   {
      pvolfrb.this.aP6 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        int[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             int[] aP6 )
   {
      pvolfrb.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pvolfrb.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pvolfrb.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pvolfrb.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pvolfrb.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      pvolfrb.this.AV11RecRb = aP5[0];
      this.aP5 = aP5;
      pvolfrb.this.AV12RecVolprd = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12RecVolprd = 0 ;
      /* Using cursor P02UG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4259RecTotKgs = P02UG2_A4259RecTotKgs[0] ;
         AV12RecVolprd = (int)(DecimalUtil.decToDouble(AV11RecRb.multiply(A4259RecTotKgs))) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pvolfrb.this.A396EmprCod;
      this.aP1[0] = pvolfrb.this.A129BarCod;
      this.aP2[0] = pvolfrb.this.A132BarCodReo;
      this.aP3[0] = pvolfrb.this.A130BarCodPar;
      this.aP4[0] = pvolfrb.this.A2804RecLinMaq;
      this.aP5[0] = pvolfrb.this.AV11RecRb;
      this.aP6[0] = pvolfrb.this.AV12RecVolprd;
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
      P02UG2_A396EmprCod = new String[] {""} ;
      P02UG2_A129BarCod = new int[1] ;
      P02UG2_A132BarCodReo = new byte[1] ;
      P02UG2_A130BarCodPar = new String[] {""} ;
      P02UG2_A2804RecLinMaq = new short[1] ;
      P02UG2_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pvolfrb__default(),
         new Object[] {
             new Object[] {
            P02UG2_A396EmprCod, P02UG2_A129BarCod, P02UG2_A132BarCodReo, P02UG2_A130BarCodPar, P02UG2_A2804RecLinMaq, P02UG2_A4259RecTotKgs
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV12RecVolprd ;
   private java.math.BigDecimal AV11RecRb ;
   private java.math.BigDecimal A4259RecTotKgs ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private int[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P02UG2_A396EmprCod ;
   private int[] P02UG2_A129BarCod ;
   private byte[] P02UG2_A132BarCodReo ;
   private String[] P02UG2_A130BarCodPar ;
   private short[] P02UG2_A2804RecLinMaq ;
   private java.math.BigDecimal[] P02UG2_A4259RecTotKgs ;
}

final  class pvolfrb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02UG2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecTotKgs FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

