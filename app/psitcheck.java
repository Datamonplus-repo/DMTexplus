package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psitcheck extends GXProcedure
{
   public psitcheck( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psitcheck.class ), "" );
   }

   public psitcheck( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      psitcheck.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      psitcheck.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psitcheck.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      psitcheck.this.AV8Usurcod = aP2[0];
      this.aP2 = aP2;
      psitcheck.this.AV9Station = aP3[0];
      this.aP3 = aP3;
      psitcheck.this.AV10NickName = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04EC2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A129BarCod = P04EC2_A129BarCod[0] ;
         A132BarCodReo = P04EC2_A132BarCodReo[0] ;
         A130BarCodPar = P04EC2_A130BarCodPar[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A129BarCod ;
         GXv_int3[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_char5[0] = AV9Station ;
         GXv_char6[0] = AV8Usurcod ;
         GXv_char7[0] = AV10NickName ;
         new app.pchecksit(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_char5, GXv_char6, GXv_char7) ;
         psitcheck.this.A396EmprCod = GXv_char1[0] ;
         psitcheck.this.A129BarCod = GXv_int2[0] ;
         psitcheck.this.A132BarCodReo = GXv_int3[0] ;
         psitcheck.this.A130BarCodPar = GXv_char4[0] ;
         psitcheck.this.AV9Station = GXv_char5[0] ;
         psitcheck.this.AV8Usurcod = GXv_char6[0] ;
         psitcheck.this.AV10NickName = GXv_char7[0] ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psitcheck.this.A396EmprCod;
      this.aP1[0] = psitcheck.this.A30AlbProCod;
      this.aP2[0] = psitcheck.this.AV8Usurcod;
      this.aP3[0] = psitcheck.this.AV9Station;
      this.aP4[0] = psitcheck.this.AV10NickName;
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
      P04EC2_A396EmprCod = new String[] {""} ;
      P04EC2_A30AlbProCod = new long[1] ;
      P04EC2_A129BarCod = new int[1] ;
      P04EC2_A132BarCodReo = new byte[1] ;
      P04EC2_A130BarCodPar = new String[] {""} ;
      A130BarCodPar = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_char7 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psitcheck__default(),
         new Object[] {
             new Object[] {
            P04EC2_A396EmprCod, P04EC2_A30AlbProCod, P04EC2_A129BarCod, P04EC2_A132BarCodReo, P04EC2_A130BarCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte GXv_int3[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int GXv_int2[] ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String AV8Usurcod ;
   private String AV9Station ;
   private String AV10NickName ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String GXv_char7[] ;
   private String[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P04EC2_A396EmprCod ;
   private long[] P04EC2_A30AlbProCod ;
   private int[] P04EC2_A129BarCod ;
   private byte[] P04EC2_A132BarCodReo ;
   private String[] P04EC2_A130BarCodPar ;
}

final  class psitcheck__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04EC2", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

