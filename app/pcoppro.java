package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcoppro extends GXProcedure
{
   public pcoppro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcoppro.class ), "" );
   }

   public pcoppro( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 )
   {
      pcoppro.this.aP1 = new long[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 )
   {
      pcoppro.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcoppro.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV8FlagPre ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ALBPRE", ""), GXv_int1) ;
      pcoppro.this.AV8FlagPre = GXv_int1[0] ;
      /* Using cursor P010V2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A129BarCod = P010V2_A129BarCod[0] ;
         A132BarCodReo = P010V2_A132BarCodReo[0] ;
         A130BarCodPar = P010V2_A130BarCodPar[0] ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = A30AlbProCod ;
         GXv_int4[0] = A129BarCod ;
         GXv_int1[0] = A132BarCodReo ;
         GXv_char5[0] = A130BarCodPar ;
         new app.pcopprd(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int4, GXv_int1, GXv_char5) ;
         pcoppro.this.A396EmprCod = GXv_char2[0] ;
         pcoppro.this.A30AlbProCod = GXv_int3[0] ;
         pcoppro.this.A129BarCod = GXv_int4[0] ;
         pcoppro.this.A132BarCodReo = GXv_int1[0] ;
         pcoppro.this.A130BarCodPar = GXv_char5[0] ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int3[0] = A30AlbProCod ;
         GXv_int4[0] = A129BarCod ;
         GXv_int1[0] = A132BarCodReo ;
         GXv_char2[0] = A130BarCodPar ;
         new app.pkgmtpr(remoteHandle, context).execute( GXv_char5, GXv_int3, GXv_int4, GXv_int1, GXv_char2) ;
         pcoppro.this.A396EmprCod = GXv_char5[0] ;
         pcoppro.this.A30AlbProCod = GXv_int3[0] ;
         pcoppro.this.A129BarCod = GXv_int4[0] ;
         pcoppro.this.A132BarCodReo = GXv_int1[0] ;
         pcoppro.this.A130BarCodPar = GXv_char2[0] ;
         if ( AV8FlagPre == 1 )
         {
         }
         else
         {
            httpContext.wjLoc = formatLink("app.talbprd", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar"})  ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcoppro.this.A396EmprCod;
      this.aP1[0] = pcoppro.this.A30AlbProCod;
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
      P010V2_A396EmprCod = new String[] {""} ;
      P010V2_A30AlbProCod = new long[1] ;
      P010V2_A129BarCod = new int[1] ;
      P010V2_A132BarCodReo = new byte[1] ;
      P010V2_A130BarCodPar = new String[] {""} ;
      A130BarCodPar = "" ;
      GXv_char5 = new String[1] ;
      GXv_int3 = new long[1] ;
      GXv_int4 = new int[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char2 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcoppro__default(),
         new Object[] {
             new Object[] {
            P010V2_A396EmprCod, P010V2_A30AlbProCod, P010V2_A129BarCod, P010V2_A132BarCodReo, P010V2_A130BarCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8FlagPre ;
   private byte A132BarCodReo ;
   private byte GXv_int1[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int GXv_int4[] ;
   private long A30AlbProCod ;
   private long GXv_int3[] ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String GXv_char5[] ;
   private String GXv_char2[] ;
   private long[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P010V2_A396EmprCod ;
   private long[] P010V2_A30AlbProCod ;
   private int[] P010V2_A129BarCod ;
   private byte[] P010V2_A132BarCodReo ;
   private String[] P010V2_A130BarCodPar ;
}

final  class pcoppro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P010V2", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

