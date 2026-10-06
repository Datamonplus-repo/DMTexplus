package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pocopfas extends GXProcedure
{
   public pocopfas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pocopfas.class ), "" );
   }

   public pocopfas( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 )
   {
      pocopfas.this.aP1 = new long[] {0};
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
      pocopfas.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pocopfas.this.A30AlbProCod = aP1[0];
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
      pocopfas.this.AV8FlagPre = GXv_int1[0] ;
      GXv_int1[0] = AV9Mafitex ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MAFITE", ""), GXv_int1) ;
      pocopfas.this.AV9Mafitex = GXv_int1[0] ;
      GXt_int2 = AV10colorsol ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "COLORS", ""), GXv_int1) ;
      pocopfas.this.GXt_int2 = GXv_int1[0] ;
      AV10colorsol = GXt_int2 ;
      /* Using cursor P00LA2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A129BarCod = P00LA2_A129BarCod[0] ;
         A132BarCodReo = P00LA2_A132BarCodReo[0] ;
         A130BarCodPar = P00LA2_A130BarCodPar[0] ;
         if ( AV10colorsol == 0 )
         {
            GXv_char3[0] = A396EmprCod ;
            GXv_int4[0] = A30AlbProCod ;
            GXv_int5[0] = A129BarCod ;
            GXv_int1[0] = A132BarCodReo ;
            GXv_char6[0] = A130BarCodPar ;
            new app.pcopfas(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, GXv_int1, GXv_char6) ;
            pocopfas.this.A396EmprCod = GXv_char3[0] ;
            pocopfas.this.A30AlbProCod = GXv_int4[0] ;
            pocopfas.this.A129BarCod = GXv_int5[0] ;
            pocopfas.this.A132BarCodReo = GXv_int1[0] ;
            pocopfas.this.A130BarCodPar = GXv_char6[0] ;
         }
         else
         {
            GXv_char6[0] = A396EmprCod ;
            GXv_int4[0] = A30AlbProCod ;
            GXv_int5[0] = A129BarCod ;
            GXv_int1[0] = A132BarCodReo ;
            GXv_char3[0] = A130BarCodPar ;
            new app.pcopyfs(remoteHandle, context).execute( GXv_char6, GXv_int4, GXv_int5, GXv_int1, GXv_char3) ;
            pocopfas.this.A396EmprCod = GXv_char6[0] ;
            pocopfas.this.A30AlbProCod = GXv_int4[0] ;
            pocopfas.this.A129BarCod = GXv_int5[0] ;
            pocopfas.this.A132BarCodReo = GXv_int1[0] ;
            pocopfas.this.A130BarCodPar = GXv_char3[0] ;
         }
         if ( AV8FlagPre == 1 )
         {
            if ( AV9Mafitex == 1 )
            {
               httpContext.wjLoc = formatLink("app.talfaac", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar"})  ;
            }
            else
            {
               httpContext.wjLoc = formatLink("app.talbpre", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar"})  ;
            }
         }
         else
         {
            httpContext.wjLoc = formatLink("app.talbfan", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar"})  ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pocopfas.this.A396EmprCod;
      this.aP1[0] = pocopfas.this.A30AlbProCod;
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
      P00LA2_A396EmprCod = new String[] {""} ;
      P00LA2_A30AlbProCod = new long[1] ;
      P00LA2_A129BarCod = new int[1] ;
      P00LA2_A132BarCodReo = new byte[1] ;
      P00LA2_A130BarCodPar = new String[] {""} ;
      A130BarCodPar = "" ;
      GXv_char6 = new String[1] ;
      GXv_int4 = new long[1] ;
      GXv_int5 = new int[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pocopfas__default(),
         new Object[] {
             new Object[] {
            P00LA2_A396EmprCod, P00LA2_A30AlbProCod, P00LA2_A129BarCod, P00LA2_A132BarCodReo, P00LA2_A130BarCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8FlagPre ;
   private byte AV9Mafitex ;
   private byte AV10colorsol ;
   private byte GXt_int2 ;
   private byte A132BarCodReo ;
   private byte GXv_int1[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int GXv_int5[] ;
   private long A30AlbProCod ;
   private long GXv_int4[] ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String GXv_char6[] ;
   private String GXv_char3[] ;
   private long[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P00LA2_A396EmprCod ;
   private long[] P00LA2_A30AlbProCod ;
   private int[] P00LA2_A129BarCod ;
   private byte[] P00LA2_A132BarCodReo ;
   private String[] P00LA2_A130BarCodPar ;
}

final  class pocopfas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00LA2", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

