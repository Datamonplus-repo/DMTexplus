package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusmtm extends GXProcedure
{
   public pbusmtm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusmtm.class ), "" );
   }

   public pbusmtm( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      pbusmtm.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             String[] aP3 )
   {
      pbusmtm.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusmtm.this.AV15NumBast = aP1[0];
      this.aP1 = aP1;
      pbusmtm.this.AV16Kilos = aP2[0];
      this.aP2 = aP2;
      pbusmtm.this.AV17GrupMaq = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17GrupMaq = "" ;
      /* Using cursor P00CZ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV16Kilos, AV16Kilos, Short.valueOf(AV15NumBast)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2021MaqMadBas = P00CZ2_A2021MaqMadBas[0] ;
         n2021MaqMadBas = P00CZ2_n2021MaqMadBas[0] ;
         A2266MaqMadKg2 = P00CZ2_A2266MaqMadKg2[0] ;
         n2266MaqMadKg2 = P00CZ2_n2266MaqMadKg2[0] ;
         A2020MaqMadKgs = P00CZ2_A2020MaqMadKgs[0] ;
         n2020MaqMadKgs = P00CZ2_n2020MaqMadKgs[0] ;
         A602MaqCod = P00CZ2_A602MaqCod[0] ;
         A2019MaqMadLin = P00CZ2_A2019MaqMadLin[0] ;
         AV17GrupMaq = A602MaqCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusmtm.this.A396EmprCod;
      this.aP1[0] = pbusmtm.this.AV15NumBast;
      this.aP2[0] = pbusmtm.this.AV16Kilos;
      this.aP3[0] = pbusmtm.this.AV17GrupMaq;
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
      P00CZ2_A396EmprCod = new String[] {""} ;
      P00CZ2_A2021MaqMadBas = new short[1] ;
      P00CZ2_n2021MaqMadBas = new boolean[] {false} ;
      P00CZ2_A2266MaqMadKg2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00CZ2_n2266MaqMadKg2 = new boolean[] {false} ;
      P00CZ2_A2020MaqMadKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00CZ2_n2020MaqMadKgs = new boolean[] {false} ;
      P00CZ2_A602MaqCod = new String[] {""} ;
      P00CZ2_A2019MaqMadLin = new short[1] ;
      A2266MaqMadKg2 = DecimalUtil.ZERO ;
      A2020MaqMadKgs = DecimalUtil.ZERO ;
      A602MaqCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusmtm__default(),
         new Object[] {
             new Object[] {
            P00CZ2_A396EmprCod, P00CZ2_A2021MaqMadBas, P00CZ2_n2021MaqMadBas, P00CZ2_A2266MaqMadKg2, P00CZ2_n2266MaqMadKg2, P00CZ2_A2020MaqMadKgs, P00CZ2_n2020MaqMadKgs, P00CZ2_A602MaqCod, P00CZ2_A2019MaqMadLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV15NumBast ;
   private short A2021MaqMadBas ;
   private short A2019MaqMadLin ;
   private short Gx_err ;
   private java.math.BigDecimal AV16Kilos ;
   private java.math.BigDecimal A2266MaqMadKg2 ;
   private java.math.BigDecimal A2020MaqMadKgs ;
   private String A396EmprCod ;
   private String AV17GrupMaq ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private boolean n2021MaqMadBas ;
   private boolean n2266MaqMadKg2 ;
   private boolean n2020MaqMadKgs ;
   private String[] aP3 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00CZ2_A396EmprCod ;
   private short[] P00CZ2_A2021MaqMadBas ;
   private boolean[] P00CZ2_n2021MaqMadBas ;
   private java.math.BigDecimal[] P00CZ2_A2266MaqMadKg2 ;
   private boolean[] P00CZ2_n2266MaqMadKg2 ;
   private java.math.BigDecimal[] P00CZ2_A2020MaqMadKgs ;
   private boolean[] P00CZ2_n2020MaqMadKgs ;
   private String[] P00CZ2_A602MaqCod ;
   private short[] P00CZ2_A2019MaqMadLin ;
}

final  class pbusmtm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00CZ2", "SELECT EmprCod, MaqMadBas, MaqMadKg2, MaqMadKgs, MaqCod, MaqMadLin FROM TXPLMAQMA WHERE (EmprCod = ?) AND (? >= MaqMadKgs and ? <= MaqMadKg2) AND (MaqMadBas = ?) ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((short[]) buf[8])[0] = rslt.getShort(6);
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
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

