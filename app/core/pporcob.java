package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pporcob extends GXProcedure
{
   public pporcob( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pporcob.class ), "" );
   }

   public pporcob( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           String aP1 ,
                                           int aP2 ,
                                           int aP3 ,
                                           byte aP4 )
   {
      pporcob.this.aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int aP2 ,
                        int aP3 ,
                        byte aP4 ,
                        java.math.BigDecimal[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             int aP3 ,
                             byte aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      pporcob.this.A396EmprCod = aP0;
      pporcob.this.A1013DibCli = aP1;
      pporcob.this.A252CliCod = aP2;
      pporcob.this.A1014DibInt = aP3;
      pporcob.this.AV9DibLinMol = aP4;
      pporcob.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8DibPrcCob = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P03N02 */
      pr_default.execute(0, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Byte.valueOf(AV9DibLinMol)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2089DibLinMol = P03N02_A2089DibLinMol[0] ;
         n2089DibLinMol = P03N02_n2089DibLinMol[0] ;
         A4860DibPrcCob = P03N02_A4860DibPrcCob[0] ;
         n4860DibPrcCob = P03N02_n4860DibPrcCob[0] ;
         A1807DibLinCil = P03N02_A1807DibLinCil[0] ;
         AV8DibPrcCob = A4860DibPrcCob ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = pporcob.this.AV8DibPrcCob;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8DibPrcCob = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P03N02_A396EmprCod = new String[] {""} ;
      P03N02_A1013DibCli = new String[] {""} ;
      P03N02_A252CliCod = new int[1] ;
      P03N02_A1014DibInt = new int[1] ;
      P03N02_A2089DibLinMol = new byte[1] ;
      P03N02_n2089DibLinMol = new boolean[] {false} ;
      P03N02_A4860DibPrcCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03N02_n4860DibPrcCob = new boolean[] {false} ;
      P03N02_A1807DibLinCil = new short[1] ;
      A4860DibPrcCob = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.pporcob__default(),
         new Object[] {
             new Object[] {
            P03N02_A396EmprCod, P03N02_A1013DibCli, P03N02_A252CliCod, P03N02_A1014DibInt, P03N02_A2089DibLinMol, P03N02_n2089DibLinMol, P03N02_A4860DibPrcCob, P03N02_n4860DibPrcCob, P03N02_A1807DibLinCil
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9DibLinMol ;
   private byte A2089DibLinMol ;
   private short A1807DibLinCil ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private java.math.BigDecimal AV8DibPrcCob ;
   private java.math.BigDecimal A4860DibPrcCob ;
   private String A396EmprCod ;
   private String A1013DibCli ;
   private String scmdbuf ;
   private boolean n2089DibLinMol ;
   private boolean n4860DibPrcCob ;
   private java.math.BigDecimal[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P03N02_A396EmprCod ;
   private String[] P03N02_A1013DibCli ;
   private int[] P03N02_A252CliCod ;
   private int[] P03N02_A1014DibInt ;
   private byte[] P03N02_A2089DibLinMol ;
   private boolean[] P03N02_n2089DibLinMol ;
   private java.math.BigDecimal[] P03N02_A4860DibPrcCob ;
   private boolean[] P03N02_n4860DibPrcCob ;
   private short[] P03N02_A1807DibLinCil ;
}

final  class pporcob__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03N02", "SELECT EmprCod, DibCli, CliCod, DibInt, DibLinMol, DibPrcCob, DibLinCil FROM TXPLDIBUC WHERE (EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ?) AND (DibLinMol = ?) ORDER BY EmprCod, DibCli, CliCod, DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

