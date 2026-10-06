package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrlmtscamara extends GXProcedure
{
   public pctrlmtscamara( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrlmtscamara.class ), "" );
   }

   public pctrlmtscamara( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             java.math.BigDecimal[] aP1 ,
                             short[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 )
   {
      pctrlmtscamara.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        java.math.BigDecimal[] aP1 ,
                        short[] aP2 ,
                        short[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             java.math.BigDecimal[] aP1 ,
                             short[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pctrlmtscamara.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrlmtscamara.this.AV14Totk = aP1[0];
      this.aP1 = aP1;
      pctrlmtscamara.this.AV15BarGraCru = aP2[0];
      this.aP2 = aP2;
      pctrlmtscamara.this.AV16BarAncAca1 = aP3[0];
      this.aP3 = aP3;
      pctrlmtscamara.this.AV20Maqcod = aP4[0];
      this.aP4 = aP4;
      pctrlmtscamara.this.Gx_msg = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18MtsCal = DecimalUtil.doubleToDec(0) ;
      AV17NCamaras = (short)(0) ;
      AV19Mtsi = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P04DK2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV20Maqcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A602MaqCod = P04DK2_A602MaqCod[0] ;
         A4321MaqPrdMax = P04DK2_A4321MaqPrdMax[0] ;
         n4321MaqPrdMax = P04DK2_n4321MaqPrdMax[0] ;
         A5420MaqSalMKi = P04DK2_A5420MaqSalMKi[0] ;
         n5420MaqSalMKi = P04DK2_n5420MaqSalMKi[0] ;
         AV17NCamaras = A4321MaqPrdMax ;
         AV19Mtsi = A5420MaqSalMKi ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( ( AV15BarGraCru > 0 ) && ( AV16BarAncAca1 > 0 ) && ( AV17NCamaras > 0 ) )
      {
         AV18MtsCal = ((AV14Totk.multiply(DecimalUtil.doubleToDec(1000))).divide(DecimalUtil.doubleToDec((AV15BarGraCru*(AV16BarAncAca1/ (double) (100)))), 18, java.math.RoundingMode.DOWN)).divide(DecimalUtil.doubleToDec(AV17NCamaras), 18, java.math.RoundingMode.DOWN) ;
         AV18MtsCal = AV18MtsCal.multiply(DecimalUtil.stringToDec("0.65")) ;
      }
      Gx_msg = " " ;
      if ( ( DecimalUtil.compareTo(AV18MtsCal, AV19Mtsi) > 0 ) && ( AV19Mtsi.doubleValue() > 0 ) )
      {
         Gx_msg = httpContext.getMessage( "Metros Receita= ", "") + GXutil.str( AV18MtsCal, 10, 2) + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "Metros ", "") + AV20Maqcod + " = " + GXutil.str( AV19Mtsi, 11, 3) + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "ATENÇAO.EXCESSO DE METROS¡¡¡", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrlmtscamara.this.A396EmprCod;
      this.aP1[0] = pctrlmtscamara.this.AV14Totk;
      this.aP2[0] = pctrlmtscamara.this.AV15BarGraCru;
      this.aP3[0] = pctrlmtscamara.this.AV16BarAncAca1;
      this.aP4[0] = pctrlmtscamara.this.AV20Maqcod;
      this.aP5[0] = pctrlmtscamara.this.Gx_msg;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18MtsCal = DecimalUtil.ZERO ;
      AV19Mtsi = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P04DK2_A396EmprCod = new String[] {""} ;
      P04DK2_A602MaqCod = new String[] {""} ;
      P04DK2_A4321MaqPrdMax = new short[1] ;
      P04DK2_n4321MaqPrdMax = new boolean[] {false} ;
      P04DK2_A5420MaqSalMKi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04DK2_n5420MaqSalMKi = new boolean[] {false} ;
      A602MaqCod = "" ;
      A5420MaqSalMKi = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrlmtscamara__default(),
         new Object[] {
             new Object[] {
            P04DK2_A396EmprCod, P04DK2_A602MaqCod, P04DK2_A4321MaqPrdMax, P04DK2_n4321MaqPrdMax, P04DK2_A5420MaqSalMKi, P04DK2_n5420MaqSalMKi
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV15BarGraCru ;
   private short AV16BarAncAca1 ;
   private short AV17NCamaras ;
   private short A4321MaqPrdMax ;
   private short Gx_err ;
   private java.math.BigDecimal AV14Totk ;
   private java.math.BigDecimal AV18MtsCal ;
   private java.math.BigDecimal AV19Mtsi ;
   private java.math.BigDecimal A5420MaqSalMKi ;
   private String A396EmprCod ;
   private String AV20Maqcod ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private boolean n4321MaqPrdMax ;
   private boolean n5420MaqSalMKi ;
   private String[] aP5 ;
   private String[] aP0 ;
   private java.math.BigDecimal[] aP1 ;
   private short[] aP2 ;
   private short[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04DK2_A396EmprCod ;
   private String[] P04DK2_A602MaqCod ;
   private short[] P04DK2_A4321MaqPrdMax ;
   private boolean[] P04DK2_n4321MaqPrdMax ;
   private java.math.BigDecimal[] P04DK2_A5420MaqSalMKi ;
   private boolean[] P04DK2_n5420MaqSalMKi ;
}

final  class pctrlmtscamara__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04DK2", "SELECT EmprCod, MaqCod, MaqPrdMax, MaqSalMKi FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

