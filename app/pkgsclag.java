package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pkgsclag extends GXProcedure
{
   public pkgsclag( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pkgsclag.class ), "" );
   }

   public pkgsclag( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           int[] aP4 )
   {
      pkgsclag.this.aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        java.math.BigDecimal[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      pkgsclag.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pkgsclag.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pkgsclag.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pkgsclag.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pkgsclag.this.AV11clicod = aP4[0];
      this.aP4 = aP4;
      pkgsclag.this.AV12BarKgm = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV13Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pkgsclag.this.GXt_char1 = GXv_char2[0] ;
      AV13Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV14EmprNom ;
      GXv_char4[0] = AV15UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char2, GXv_char3, GXv_char4) ;
      pkgsclag.this.A396EmprCod = GXv_char2[0] ;
      pkgsclag.this.AV14EmprNom = GXv_char3[0] ;
      pkgsclag.this.AV15UsurCod = GXv_char4[0] ;
      /* Using cursor P04KL2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1508CliCodAgr = P04KL2_A1508CliCodAgr[0] ;
         A590KgmAgr = P04KL2_A590KgmAgr[0] ;
         A122BarAgrPar = P04KL2_A122BarAgrPar[0] ;
         A124BarAgrReo = P04KL2_A124BarAgrReo[0] ;
         A119BarAgrCod = P04KL2_A119BarAgrCod[0] ;
         if ( AV11clicod == A1508CliCodAgr )
         {
            AV12BarKgm = AV12BarKgm.add(A590KgmAgr) ;
            AV16inc_obs = httpContext.getMessage( "Agrupacion.", "") + GXutil.newLine( ) ;
            AV16inc_obs += httpContext.getMessage( "Cliente     =", "") + GXutil.str( AV11clicod, 6, 0) + GXutil.newLine( ) ;
            AV16inc_obs += httpContext.getMessage( "Hdr Agr     =", "") + GXutil.str( A119BarAgrCod, 8, 0) + " " + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar + GXutil.newLine( ) ;
            AV16inc_obs += httpContext.getMessage( "Cliente Agr =", "") + GXutil.str( A1508CliCodAgr, 6, 0) + GXutil.newLine( ) ;
            AV16inc_obs += httpContext.getMessage( "Kgs     Agr =", "") + GXutil.str( A590KgmAgr, 9, 2) + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV20Pgmname, AV15UsurCod, AV13Station, AV16inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pkgsclag.this.A396EmprCod;
      this.aP1[0] = pkgsclag.this.A129BarCod;
      this.aP2[0] = pkgsclag.this.A132BarCodReo;
      this.aP3[0] = pkgsclag.this.A130BarCodPar;
      this.aP4[0] = pkgsclag.this.AV11clicod;
      this.aP5[0] = pkgsclag.this.AV12BarKgm;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV14EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV15UsurCod = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P04KL2_A396EmprCod = new String[] {""} ;
      P04KL2_A129BarCod = new int[1] ;
      P04KL2_A132BarCodReo = new byte[1] ;
      P04KL2_A130BarCodPar = new String[] {""} ;
      P04KL2_A1508CliCodAgr = new int[1] ;
      P04KL2_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04KL2_A122BarAgrPar = new String[] {""} ;
      P04KL2_A124BarAgrReo = new byte[1] ;
      P04KL2_A119BarAgrCod = new int[1] ;
      A590KgmAgr = DecimalUtil.ZERO ;
      A122BarAgrPar = "" ;
      AV16inc_obs = "" ;
      AV20Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pkgsclag__default(),
         new Object[] {
             new Object[] {
            P04KL2_A396EmprCod, P04KL2_A129BarCod, P04KL2_A132BarCodReo, P04KL2_A130BarCodPar, P04KL2_A1508CliCodAgr, P04KL2_A590KgmAgr, P04KL2_A122BarAgrPar, P04KL2_A124BarAgrReo, P04KL2_A119BarAgrCod
            }
         }
      );
      AV20Pgmname = "PKgsClAg" ;
      /* GeneXus formulas. */
      AV20Pgmname = "PKgsClAg" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV11clicod ;
   private int A1508CliCodAgr ;
   private int A119BarAgrCod ;
   private java.math.BigDecimal AV12BarKgm ;
   private java.math.BigDecimal A590KgmAgr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV13Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV14EmprNom ;
   private String GXv_char3[] ;
   private String AV15UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A122BarAgrPar ;
   private String AV20Pgmname ;
   private String AV16inc_obs ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04KL2_A396EmprCod ;
   private int[] P04KL2_A129BarCod ;
   private byte[] P04KL2_A132BarCodReo ;
   private String[] P04KL2_A130BarCodPar ;
   private int[] P04KL2_A1508CliCodAgr ;
   private java.math.BigDecimal[] P04KL2_A590KgmAgr ;
   private String[] P04KL2_A122BarAgrPar ;
   private byte[] P04KL2_A124BarAgrReo ;
   private int[] P04KL2_A119BarAgrCod ;
}

final  class pkgsclag__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04KL2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, CliCodAgr, KgmAgr, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
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
               return;
      }
   }

}

