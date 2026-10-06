package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprocesos extends GXProcedure
{
   public pprocesos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprocesos.class ), "" );
   }

   public pprocesos( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] AV8Tab_procesos ,
                             String[] aP5 )
   {
      pprocesos.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, AV8Tab_procesos, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] AV8Tab_procesos ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, AV8Tab_procesos, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] AV8Tab_procesos ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pprocesos.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprocesos.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pprocesos.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pprocesos.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pprocesos.this.AV8Tab_procesos = AV8Tab_procesos;
      pprocesos.this.AV11Usurcod = aP5[0];
      this.aP5 = aP5;
      pprocesos.this.AV12Station = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV8Tab_procesos[GX_I-1] = " " ;
         GX_I = (int)(GX_I+1) ;
      }
      AV9i = (short)(1) ;
      /* Using cursor P04FS2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A758ProCod = P04FS2_A758ProCod[0] ;
         AV8Tab_procesos[AV9i-1] = A758ProCod ;
         AV9i = (short)(AV9i+1) ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A129BarCod ;
         GXv_int3[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_char5[0] = A758ProCod ;
         GXv_char6[0] = httpContext.getMessage( "DEL", "") ;
         new app.prenfas(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_char5, GXv_char6) ;
         pprocesos.this.A396EmprCod = GXv_char1[0] ;
         pprocesos.this.A129BarCod = GXv_int2[0] ;
         pprocesos.this.A132BarCodReo = GXv_int3[0] ;
         pprocesos.this.A130BarCodPar = GXv_char4[0] ;
         pprocesos.this.A758ProCod = GXv_char5[0] ;
         AV10Inc_obs = httpContext.getMessage( "Tenclav. Muestras .Elimino Proceso= ", "") + A758ProCod + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV16Pgmname, AV11Usurcod, AV12Station, AV10Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprocesos.this.A396EmprCod;
      this.aP1[0] = pprocesos.this.A129BarCod;
      this.aP2[0] = pprocesos.this.A132BarCodReo;
      this.aP3[0] = pprocesos.this.A130BarCodPar;
      this.aP5[0] = pprocesos.this.AV11Usurcod;
      this.aP6[0] = pprocesos.this.AV12Station;
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
      P04FS2_A396EmprCod = new String[] {""} ;
      P04FS2_A129BarCod = new int[1] ;
      P04FS2_A132BarCodReo = new byte[1] ;
      P04FS2_A130BarCodPar = new String[] {""} ;
      P04FS2_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      AV10Inc_obs = "" ;
      AV16Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprocesos__default(),
         new Object[] {
             new Object[] {
            P04FS2_A396EmprCod, P04FS2_A129BarCod, P04FS2_A132BarCodReo, P04FS2_A130BarCodPar, P04FS2_A758ProCod
            }
         }
      );
      AV16Pgmname = "PProcesos" ;
      /* GeneXus formulas. */
      AV16Pgmname = "PProcesos" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte GXv_int3[] ;
   private short AV9i ;
   private short Gx_err ;
   private int A129BarCod ;
   private int GX_I ;
   private int GXv_int2[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8Tab_procesos[] ;
   private String AV11Usurcod ;
   private String AV12Station ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String AV16Pgmname ;
   private String AV10Inc_obs ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P04FS2_A396EmprCod ;
   private int[] P04FS2_A129BarCod ;
   private byte[] P04FS2_A132BarCodReo ;
   private String[] P04FS2_A130BarCodPar ;
   private String[] P04FS2_A758ProCod ;
}

final  class pprocesos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04FS2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
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

