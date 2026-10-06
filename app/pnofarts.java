package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnofarts extends GXProcedure
{
   public pnofarts( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnofarts.class ), "" );
   }

   public pnofarts( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pnofarts.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      pnofarts.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnofarts.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04CK2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P04CK2_A252CliCod[0] ;
         n252CliCod = P04CK2_n252CliCod[0] ;
         A212BarSer = P04CK2_A212BarSer[0] ;
         A129BarCod = P04CK2_A129BarCod[0] ;
         A132BarCodReo = P04CK2_A132BarCodReo[0] ;
         A130BarCodPar = P04CK2_A130BarCodPar[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A252CliCod ;
         GXv_char3[0] = A212BarSer ;
         GXv_int4[0] = A129BarCod ;
         GXv_int5[0] = A132BarCodReo ;
         GXv_char6[0] = A130BarCodPar ;
         new app.pnofart(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_int4, GXv_int5, GXv_char6) ;
         pnofarts.this.A396EmprCod = GXv_char1[0] ;
         pnofarts.this.A252CliCod = GXv_int2[0] ;
         pnofarts.this.A212BarSer = GXv_char3[0] ;
         pnofarts.this.A129BarCod = GXv_int4[0] ;
         pnofarts.this.A132BarCodReo = GXv_int5[0] ;
         pnofarts.this.A130BarCodPar = GXv_char6[0] ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnofarts.this.A396EmprCod;
      this.aP1[0] = pnofarts.this.A361DisCod;
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
      P04CK2_A396EmprCod = new String[] {""} ;
      P04CK2_A361DisCod = new int[1] ;
      P04CK2_A252CliCod = new int[1] ;
      P04CK2_n252CliCod = new boolean[] {false} ;
      P04CK2_A212BarSer = new String[] {""} ;
      P04CK2_A129BarCod = new int[1] ;
      P04CK2_A132BarCodReo = new byte[1] ;
      P04CK2_A130BarCodPar = new String[] {""} ;
      A212BarSer = "" ;
      A130BarCodPar = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char6 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnofarts__default(),
         new Object[] {
             new Object[] {
            P04CK2_A396EmprCod, P04CK2_A361DisCod, P04CK2_A252CliCod, P04CK2_n252CliCod, P04CK2_A212BarSer, P04CK2_A129BarCod, P04CK2_A132BarCodReo, P04CK2_A130BarCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte GXv_int5[] ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int GXv_int2[] ;
   private int GXv_int4[] ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String A130BarCodPar ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char6[] ;
   private boolean n252CliCod ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P04CK2_A396EmprCod ;
   private int[] P04CK2_A361DisCod ;
   private int[] P04CK2_A252CliCod ;
   private boolean[] P04CK2_n252CliCod ;
   private String[] P04CK2_A212BarSer ;
   private int[] P04CK2_A129BarCod ;
   private byte[] P04CK2_A132BarCodReo ;
   private String[] P04CK2_A130BarCodPar ;
}

final  class pnofarts__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04CK2", "SELECT EmprCod, DisCod, CliCod, BarSer, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
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
               return;
      }
   }

}

