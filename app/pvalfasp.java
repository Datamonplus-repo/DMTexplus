package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvalfasp extends GXProcedure
{
   public pvalfasp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvalfasp.class ), "" );
   }

   public pvalfasp( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           java.math.BigDecimal[] aP4 )
   {
      pvalfasp.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             byte[] aP5 )
   {
      pvalfasp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pvalfasp.this.AV18Procod = aP1[0];
      this.aP1 = aP1;
      pvalfasp.this.AV19FasCod = aP2[0];
      this.aP2 = aP2;
      pvalfasp.this.AV14FasDsc = aP3[0];
      this.aP3 = aP3;
      pvalfasp.this.AV17Manprefas = aP4[0];
      this.aP4 = aP4;
      pvalfasp.this.AV13Flag = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13Flag = (byte)(0) ;
      AV17Manprefas = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P039O2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV18Procod, AV19FasCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6162SecCodF = P039O2_A6162SecCodF[0] ;
         n6162SecCodF = P039O2_n6162SecCodF[0] ;
         A457FasCod = P039O2_A457FasCod[0] ;
         A758ProCod = P039O2_A758ProCod[0] ;
         A460FasDsc = P039O2_A460FasDsc[0] ;
         A7893Dtp_Tpp = P039O2_A7893Dtp_Tpp[0] ;
         n7893Dtp_Tpp = P039O2_n7893Dtp_Tpp[0] ;
         A6879FasTpp = P039O2_A6879FasTpp[0] ;
         n6879FasTpp = P039O2_n6879FasTpp[0] ;
         A7601SecMod = P039O2_A7601SecMod[0] ;
         n7601SecMod = P039O2_n7601SecMod[0] ;
         A774ProNumLin = P039O2_A774ProNumLin[0] ;
         A6162SecCodF = P039O2_A6162SecCodF[0] ;
         n6162SecCodF = P039O2_n6162SecCodF[0] ;
         A460FasDsc = P039O2_A460FasDsc[0] ;
         A6879FasTpp = P039O2_A6879FasTpp[0] ;
         n6879FasTpp = P039O2_n6879FasTpp[0] ;
         A7601SecMod = P039O2_A7601SecMod[0] ;
         n7601SecMod = P039O2_n7601SecMod[0] ;
         AV14FasDsc = A460FasDsc ;
         if ( A7893Dtp_Tpp.doubleValue() != 0 )
         {
            AV15FasTpp = A7893Dtp_Tpp ;
         }
         else
         {
            AV15FasTpp = A6879FasTpp ;
         }
         AV16SecMod = A7601SecMod ;
         AV17Manprefas = GXutil.roundDecimal( AV15FasTpp.multiply(AV16SecMod), 2) ;
         AV13Flag = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pvalfasp.this.A396EmprCod;
      this.aP1[0] = pvalfasp.this.AV18Procod;
      this.aP2[0] = pvalfasp.this.AV19FasCod;
      this.aP3[0] = pvalfasp.this.AV14FasDsc;
      this.aP4[0] = pvalfasp.this.AV17Manprefas;
      this.aP5[0] = pvalfasp.this.AV13Flag;
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
      P039O2_A6162SecCodF = new String[] {""} ;
      P039O2_n6162SecCodF = new boolean[] {false} ;
      P039O2_A396EmprCod = new String[] {""} ;
      P039O2_A457FasCod = new String[] {""} ;
      P039O2_A758ProCod = new String[] {""} ;
      P039O2_A460FasDsc = new String[] {""} ;
      P039O2_A7893Dtp_Tpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P039O2_n7893Dtp_Tpp = new boolean[] {false} ;
      P039O2_A6879FasTpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P039O2_n6879FasTpp = new boolean[] {false} ;
      P039O2_A7601SecMod = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P039O2_n7601SecMod = new boolean[] {false} ;
      P039O2_A774ProNumLin = new short[1] ;
      A6162SecCodF = "" ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      A460FasDsc = "" ;
      A7893Dtp_Tpp = DecimalUtil.ZERO ;
      A6879FasTpp = DecimalUtil.ZERO ;
      A7601SecMod = DecimalUtil.ZERO ;
      AV15FasTpp = DecimalUtil.ZERO ;
      AV16SecMod = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pvalfasp__default(),
         new Object[] {
             new Object[] {
            P039O2_A6162SecCodF, P039O2_n6162SecCodF, P039O2_A396EmprCod, P039O2_A457FasCod, P039O2_A758ProCod, P039O2_A460FasDsc, P039O2_A7893Dtp_Tpp, P039O2_n7893Dtp_Tpp, P039O2_A6879FasTpp, P039O2_n6879FasTpp,
            P039O2_A7601SecMod, P039O2_n7601SecMod, P039O2_A774ProNumLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13Flag ;
   private short A774ProNumLin ;
   private short Gx_err ;
   private java.math.BigDecimal AV17Manprefas ;
   private java.math.BigDecimal A7893Dtp_Tpp ;
   private java.math.BigDecimal A6879FasTpp ;
   private java.math.BigDecimal A7601SecMod ;
   private java.math.BigDecimal AV15FasTpp ;
   private java.math.BigDecimal AV16SecMod ;
   private String A396EmprCod ;
   private String AV18Procod ;
   private String AV19FasCod ;
   private String AV14FasDsc ;
   private String scmdbuf ;
   private String A6162SecCodF ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String A460FasDsc ;
   private boolean n6162SecCodF ;
   private boolean n7893Dtp_Tpp ;
   private boolean n6879FasTpp ;
   private boolean n7601SecMod ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P039O2_A6162SecCodF ;
   private boolean[] P039O2_n6162SecCodF ;
   private String[] P039O2_A396EmprCod ;
   private String[] P039O2_A457FasCod ;
   private String[] P039O2_A758ProCod ;
   private String[] P039O2_A460FasDsc ;
   private java.math.BigDecimal[] P039O2_A7893Dtp_Tpp ;
   private boolean[] P039O2_n7893Dtp_Tpp ;
   private java.math.BigDecimal[] P039O2_A6879FasTpp ;
   private boolean[] P039O2_n6879FasTpp ;
   private java.math.BigDecimal[] P039O2_A7601SecMod ;
   private boolean[] P039O2_n7601SecMod ;
   private short[] P039O2_A774ProNumLin ;
}

final  class pvalfasp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P039O2", "SELECT T2.SecCodF, T1.EmprCod, T1.FasCod, T1.ProCod, T2.FasDsc, T1.Dtp_Tpp, T2.FasTpp, T3.SecMod, T1.ProNumLin FROM ((TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) LEFT JOIN TXPTSECCI T3 ON T3.EmprCod = T1.EmprCod AND T3.SecCodF = T2.SecCodF) WHERE (T1.EmprCod = ? and T1.ProCod = ?) AND (T1.FasCod = ?) ORDER BY T1.EmprCod, T1.ProCod, T1.ProNumLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((String[]) buf[5])[0] = rslt.getString(5, 28);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(9);
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
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

