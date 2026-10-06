package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcosgen extends GXProcedure
{
   public pcosgen( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcosgen.class ), "" );
   }

   public pcosgen( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           int aP1 ,
                                           String aP2 ,
                                           java.math.BigDecimal aP3 ,
                                           short aP4 )
   {
      pcosgen.this.aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        java.math.BigDecimal aP3 ,
                        short aP4 ,
                        java.math.BigDecimal[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             java.math.BigDecimal aP3 ,
                             short aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      pcosgen.this.A396EmprCod = aP0;
      pcosgen.this.AV8CliCod = aP1;
      pcosgen.this.AV9ArtCod = aP2;
      pcosgen.this.AV12Coste_Cor = aP3;
      pcosgen.this.AV13GrdTipARt = aP4;
      pcosgen.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P019F2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(AV13GrdTipARt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4364GrdTipArt = P019F2_A4364GrdTipArt[0] ;
         A4377GrdTipCos = P019F2_A4377GrdTipCos[0] ;
         A4376GrdTipVal = P019F2_A4376GrdTipVal[0] ;
         if ( DecimalUtil.compareTo(AV12Coste_Cor, A4376GrdTipVal) < 0 )
         {
            AV10Coste_Tart = A4377GrdTipCos ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = pcosgen.this.AV10Coste_Tart;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Coste_Tart = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P019F2_A396EmprCod = new String[] {""} ;
      P019F2_A4364GrdTipArt = new short[1] ;
      P019F2_A4377GrdTipCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P019F2_A4376GrdTipVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A4377GrdTipCos = DecimalUtil.ZERO ;
      A4376GrdTipVal = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcosgen__default(),
         new Object[] {
             new Object[] {
            P019F2_A396EmprCod, P019F2_A4364GrdTipArt, P019F2_A4377GrdTipCos, P019F2_A4376GrdTipVal
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV13GrdTipARt ;
   private short A4364GrdTipArt ;
   private short Gx_err ;
   private int AV8CliCod ;
   private java.math.BigDecimal AV12Coste_Cor ;
   private java.math.BigDecimal AV10Coste_Tart ;
   private java.math.BigDecimal A4377GrdTipCos ;
   private java.math.BigDecimal A4376GrdTipVal ;
   private String A396EmprCod ;
   private String AV9ArtCod ;
   private String scmdbuf ;
   private java.math.BigDecimal[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P019F2_A396EmprCod ;
   private short[] P019F2_A4364GrdTipArt ;
   private java.math.BigDecimal[] P019F2_A4377GrdTipCos ;
   private java.math.BigDecimal[] P019F2_A4376GrdTipVal ;
}

final  class pcosgen__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P019F2", "SELECT EmprCod, GrdTipArt, GrdTipCos, GrdTipVal FROM TXPGRDTAR WHERE EmprCod = ? and GrdTipArt = ? ORDER BY EmprCod, GrdTipArt, GrdTipVal ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

