package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppzaprod extends GXProcedure
{
   public ppzaprod( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppzaprod.class ), "" );
   }

   public ppzaprod( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 )
   {
      ppzaprod.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      ppzaprod.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppzaprod.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      ppzaprod.this.A200BarPieCod = aP2[0];
      this.aP2 = aP2;
      ppzaprod.this.AV8Ok = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11GXLvl1 = (byte)(0) ;
      /* Using cursor P04A62 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A200BarPieCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A205BarPieMet = P04A62_A205BarPieMet[0] ;
         A129BarCod = P04A62_A129BarCod[0] ;
         A132BarCodReo = P04A62_A132BarCodReo[0] ;
         A130BarCodPar = P04A62_A130BarCodPar[0] ;
         AV11GXLvl1 = (byte)(1) ;
         AV8Ok = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV11GXLvl1 == 0 )
      {
         AV8Ok = (byte)(0) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppzaprod.this.A396EmprCod;
      this.aP1[0] = ppzaprod.this.A44AlbRecCod;
      this.aP2[0] = ppzaprod.this.A200BarPieCod;
      this.aP3[0] = ppzaprod.this.AV8Ok;
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
      P04A62_A396EmprCod = new String[] {""} ;
      P04A62_A200BarPieCod = new String[] {""} ;
      P04A62_A44AlbRecCod = new int[1] ;
      P04A62_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04A62_A129BarCod = new int[1] ;
      P04A62_A132BarCodReo = new byte[1] ;
      P04A62_A130BarCodPar = new String[] {""} ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppzaprod__default(),
         new Object[] {
             new Object[] {
            P04A62_A396EmprCod, P04A62_A200BarPieCod, P04A62_A44AlbRecCod, P04A62_A205BarPieMet, P04A62_A129BarCod, P04A62_A132BarCodReo, P04A62_A130BarCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8Ok ;
   private byte AV11GXLvl1 ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private int A129BarCod ;
   private java.math.BigDecimal A205BarPieMet ;
   private String A396EmprCod ;
   private String A200BarPieCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04A62_A396EmprCod ;
   private String[] P04A62_A200BarPieCod ;
   private int[] P04A62_A44AlbRecCod ;
   private java.math.BigDecimal[] P04A62_A205BarPieMet ;
   private int[] P04A62_A129BarCod ;
   private byte[] P04A62_A132BarCodReo ;
   private String[] P04A62_A130BarCodPar ;
}

final  class ppzaprod__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04A62", "SELECT EmprCod, BarPieCod, AlbRecCod, BarPieMet, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE WHERE (EmprCod = ? and AlbRecCod = ?) AND (BarPieCod = ?) ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
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
               stmt.setString(3, (String)parms[2], 9);
               return;
      }
   }

}

