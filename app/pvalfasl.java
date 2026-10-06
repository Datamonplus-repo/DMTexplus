package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvalfasl extends GXProcedure
{
   public pvalfasl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvalfasl.class ), "" );
   }

   public pvalfasl( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           String[] aP2 ,
                           java.math.BigDecimal[] aP3 )
   {
      pvalfasl.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             byte[] aP4 )
   {
      pvalfasl.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pvalfasl.this.A457FasCod = aP1[0];
      this.aP1 = aP1;
      pvalfasl.this.AV14FasDsc = aP2[0];
      this.aP2 = aP2;
      pvalfasl.this.AV17Manprefas = aP3[0];
      this.aP3 = aP3;
      pvalfasl.this.AV13Flag = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13Flag = (byte)(0) ;
      AV17Manprefas = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P03632 */
      pr_default.execute(0, new Object[] {A396EmprCod, A457FasCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6162SecCodF = P03632_A6162SecCodF[0] ;
         n6162SecCodF = P03632_n6162SecCodF[0] ;
         A460FasDsc = P03632_A460FasDsc[0] ;
         A6879FasTpp = P03632_A6879FasTpp[0] ;
         n6879FasTpp = P03632_n6879FasTpp[0] ;
         A7601SecMod = P03632_A7601SecMod[0] ;
         n7601SecMod = P03632_n7601SecMod[0] ;
         A7601SecMod = P03632_A7601SecMod[0] ;
         n7601SecMod = P03632_n7601SecMod[0] ;
         AV14FasDsc = A460FasDsc ;
         AV15FasTpp = A6879FasTpp ;
         AV16SecMod = A7601SecMod ;
         AV17Manprefas = GXutil.roundDecimal( A6879FasTpp.multiply(AV16SecMod), 2) ;
         AV13Flag = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pvalfasl.this.A396EmprCod;
      this.aP1[0] = pvalfasl.this.A457FasCod;
      this.aP2[0] = pvalfasl.this.AV14FasDsc;
      this.aP3[0] = pvalfasl.this.AV17Manprefas;
      this.aP4[0] = pvalfasl.this.AV13Flag;
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
      P03632_A6162SecCodF = new String[] {""} ;
      P03632_n6162SecCodF = new boolean[] {false} ;
      P03632_A396EmprCod = new String[] {""} ;
      P03632_A457FasCod = new String[] {""} ;
      P03632_A460FasDsc = new String[] {""} ;
      P03632_A6879FasTpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03632_n6879FasTpp = new boolean[] {false} ;
      P03632_A7601SecMod = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03632_n7601SecMod = new boolean[] {false} ;
      A6162SecCodF = "" ;
      A460FasDsc = "" ;
      A6879FasTpp = DecimalUtil.ZERO ;
      A7601SecMod = DecimalUtil.ZERO ;
      AV15FasTpp = DecimalUtil.ZERO ;
      AV16SecMod = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pvalfasl__default(),
         new Object[] {
             new Object[] {
            P03632_A6162SecCodF, P03632_n6162SecCodF, P03632_A396EmprCod, P03632_A457FasCod, P03632_A460FasDsc, P03632_A6879FasTpp, P03632_n6879FasTpp, P03632_A7601SecMod, P03632_n7601SecMod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13Flag ;
   private short Gx_err ;
   private java.math.BigDecimal AV17Manprefas ;
   private java.math.BigDecimal A6879FasTpp ;
   private java.math.BigDecimal A7601SecMod ;
   private java.math.BigDecimal AV15FasTpp ;
   private java.math.BigDecimal AV16SecMod ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String AV14FasDsc ;
   private String scmdbuf ;
   private String A6162SecCodF ;
   private String A460FasDsc ;
   private boolean n6162SecCodF ;
   private boolean n6879FasTpp ;
   private boolean n7601SecMod ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P03632_A6162SecCodF ;
   private boolean[] P03632_n6162SecCodF ;
   private String[] P03632_A396EmprCod ;
   private String[] P03632_A457FasCod ;
   private String[] P03632_A460FasDsc ;
   private java.math.BigDecimal[] P03632_A6879FasTpp ;
   private boolean[] P03632_n6879FasTpp ;
   private java.math.BigDecimal[] P03632_A7601SecMod ;
   private boolean[] P03632_n7601SecMod ;
}

final  class pvalfasl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03632", "SELECT T1.SecCodF, T1.EmprCod, T1.FasCod, T1.FasDsc, T1.FasTpp, T2.SecMod FROM (TXPFASPRO T1 LEFT JOIN TXPTSECCI T2 ON T2.EmprCod = T1.EmprCod AND T2.SecCodF = T1.SecCodF) WHERE T1.EmprCod = ? and T1.FasCod = ? ORDER BY T1.EmprCod, T1.FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((String[]) buf[4])[0] = rslt.getString(4, 28);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

