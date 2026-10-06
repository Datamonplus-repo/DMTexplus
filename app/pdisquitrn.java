package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdisquitrn extends GXProcedure
{
   public pdisquitrn( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdisquitrn.class ), "" );
   }

   public pdisquitrn( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pdisquitrn.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pdisquitrn.this.AV24EmprCod = aP0[0];
      this.aP0 = aP0;
      pdisquitrn.this.AV22DisCod = aP1[0];
      this.aP1 = aP1;
      pdisquitrn.this.AV23ProCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04BQ2 */
      pr_default.execute(0, new Object[] {AV24EmprCod, Integer.valueOf(AV22DisCod), AV23ProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A758ProCod = P04BQ2_A758ProCod[0] ;
         A361DisCod = P04BQ2_A361DisCod[0] ;
         A396EmprCod = P04BQ2_A396EmprCod[0] ;
         A368DisFasLin = P04BQ2_A368DisFasLin[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A361DisCod ;
         GXv_char3[0] = A758ProCod ;
         GXv_int4[0] = A368DisFasLin ;
         GXv_int5[0] = AV35Disqui ;
         GXv_int6[0] = AV36dt004 ;
         new app.pexisdisqui(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_int4, GXv_int5, GXv_int6) ;
         pdisquitrn.this.A396EmprCod = GXv_char1[0] ;
         pdisquitrn.this.A361DisCod = GXv_int2[0] ;
         pdisquitrn.this.A758ProCod = GXv_char3[0] ;
         pdisquitrn.this.A368DisFasLin = GXv_int4[0] ;
         pdisquitrn.this.AV35Disqui = GXv_int5[0] ;
         pdisquitrn.this.AV36dt004 = GXv_int6[0] ;
         if ( AV36dt004 == 1 )
         {
            httpContext.wjLoc = formatLink("app.tdt004", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A368DisFasLin,4,0))}, new String[] {"EmprCod","DisCod","ProCod","DisFasLin"})  ;
         }
         else
         {
            if ( AV35Disqui == 1 )
            {
               httpContext.wjLoc = formatLink("app.tdisqui", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A368DisFasLin,4,0))}, new String[] {"EmprCod","DisCod","ProCod","DisFasLin"})  ;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdisquitrn.this.AV24EmprCod;
      this.aP1[0] = pdisquitrn.this.AV22DisCod;
      this.aP2[0] = pdisquitrn.this.AV23ProCod;
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
      P04BQ2_A758ProCod = new String[] {""} ;
      P04BQ2_A361DisCod = new int[1] ;
      P04BQ2_A396EmprCod = new String[] {""} ;
      P04BQ2_A368DisFasLin = new short[1] ;
      A758ProCod = "" ;
      A396EmprCod = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new short[1] ;
      GXv_int5 = new byte[1] ;
      GXv_int6 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdisquitrn__default(),
         new Object[] {
             new Object[] {
            P04BQ2_A758ProCod, P04BQ2_A361DisCod, P04BQ2_A396EmprCod, P04BQ2_A368DisFasLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV35Disqui ;
   private byte GXv_int5[] ;
   private byte AV36dt004 ;
   private byte GXv_int6[] ;
   private short A368DisFasLin ;
   private short GXv_int4[] ;
   private short Gx_err ;
   private int AV22DisCod ;
   private int A361DisCod ;
   private int GXv_int2[] ;
   private String AV24EmprCod ;
   private String AV23ProCod ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A396EmprCod ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P04BQ2_A758ProCod ;
   private int[] P04BQ2_A361DisCod ;
   private String[] P04BQ2_A396EmprCod ;
   private short[] P04BQ2_A368DisFasLin ;
}

final  class pdisquitrn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04BQ2", "SELECT ProCod, DisCod, EmprCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? and ProCod = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

