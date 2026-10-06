package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrlinbd extends GXProcedure
{
   public pctrlinbd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrlinbd.class ), "" );
   }

   public pctrlinbd( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pctrlinbd.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pctrlinbd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrlinbd.this.A8735Be_hdr = aP1[0];
      this.aP1 = aP1;
      pctrlinbd.this.A8736Be_hdrr = aP2[0];
      this.aP2 = aP2;
      pctrlinbd.this.A8737Be_hdrp = aP3[0];
      this.aP3 = aP3;
      pctrlinbd.this.Gx_msg = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = "" ;
      /* Using cursor P03IE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A8735Be_hdr), Byte.valueOf(A8736Be_hdrr), A8737Be_hdrp});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8744Be_Mts = P03IE2_A8744Be_Mts[0] ;
         n8744Be_Mts = P03IE2_n8744Be_Mts[0] ;
         A8740Be_Pza = P03IE2_A8740Be_Pza[0] ;
         if ( A8744Be_Mts.doubleValue() == 0 )
         {
            Gx_msg = httpContext.getMessage( "Hay Piezas sin METROS ¡¡¡", "") + GXutil.newLine( ) + httpContext.getMessage( "No puede entrar en Bodega Estampacion", "") + GXutil.newLine( ) + httpContext.getMessage( "Revise las piezas", "") ;
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
      this.aP0[0] = pctrlinbd.this.A396EmprCod;
      this.aP1[0] = pctrlinbd.this.A8735Be_hdr;
      this.aP2[0] = pctrlinbd.this.A8736Be_hdrr;
      this.aP3[0] = pctrlinbd.this.A8737Be_hdrp;
      this.aP4[0] = pctrlinbd.this.Gx_msg;
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
      P03IE2_A396EmprCod = new String[] {""} ;
      P03IE2_A8735Be_hdr = new int[1] ;
      P03IE2_A8736Be_hdrr = new byte[1] ;
      P03IE2_A8737Be_hdrp = new String[] {""} ;
      P03IE2_A8744Be_Mts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03IE2_n8744Be_Mts = new boolean[] {false} ;
      P03IE2_A8740Be_Pza = new String[] {""} ;
      A8744Be_Mts = DecimalUtil.ZERO ;
      A8740Be_Pza = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrlinbd__default(),
         new Object[] {
             new Object[] {
            P03IE2_A396EmprCod, P03IE2_A8735Be_hdr, P03IE2_A8736Be_hdrr, P03IE2_A8737Be_hdrp, P03IE2_A8744Be_Mts, P03IE2_n8744Be_Mts, P03IE2_A8740Be_Pza
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A8736Be_hdrr ;
   private short Gx_err ;
   private int A8735Be_hdr ;
   private java.math.BigDecimal A8744Be_Mts ;
   private String A396EmprCod ;
   private String A8737Be_hdrp ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A8740Be_Pza ;
   private boolean n8744Be_Mts ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P03IE2_A396EmprCod ;
   private int[] P03IE2_A8735Be_hdr ;
   private byte[] P03IE2_A8736Be_hdrr ;
   private String[] P03IE2_A8737Be_hdrp ;
   private java.math.BigDecimal[] P03IE2_A8744Be_Mts ;
   private boolean[] P03IE2_n8744Be_Mts ;
   private String[] P03IE2_A8740Be_Pza ;
}

final  class pctrlinbd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03IE2", "SELECT EmprCod, Be_hdr, Be_hdrr, Be_hdrp, Be_Mts, Be_Pza FROM TXPINOTB1 WHERE EmprCod = ? and Be_hdr = ? and Be_hdrr = ? and Be_hdrp = ? ORDER BY EmprCod, Be_hdr, Be_hdrr, Be_hdrp, Be_Pza ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 9);
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

