package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppintcc extends GXProcedure
{
   public ppintcc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppintcc.class ), "" );
   }

   public ppintcc( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           short[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 ,
                           short[] aP5 ,
                           String[] aP6 ,
                           String[] aP7 ,
                           int[] aP8 )
   {
      ppintcc.this.aP9 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        int[] aP8 ,
                        byte[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             int[] aP8 ,
                             byte[] aP9 )
   {
      ppintcc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppintcc.this.AV11Clicod = aP1[0];
      this.aP1 = aP1;
      ppintcc.this.AV10Tb1_cod = aP2[0];
      this.aP2 = aP2;
      ppintcc.this.AV9Ccartcod = aP3[0];
      this.aP3 = aP3;
      ppintcc.this.AV8CCartdsc = aP4[0];
      this.aP4 = aP4;
      ppintcc.this.AV12Tipartiid = aP5[0];
      this.aP5 = aP5;
      ppintcc.this.AV13tipArtids = aP6[0];
      this.aP6 = aP6;
      ppintcc.this.AV14CCColNom = aP7[0];
      this.aP7 = aP7;
      ppintcc.this.AV15CCColNum = aP8[0];
      this.aP8 = aP8;
      ppintcc.this.AV16CCCtc = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( ( GXutil.strcmp(AV14CCColNom, " ") == 0 ) && ( AV15CCColNum == 0 ) && ( AV16CCCtc == 0 ) )
      {
         httpContext.wjLoc = formatLink("app.tintcc", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV11Clicod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10Tb1_cod,4,0)),GXutil.URLEncode(GXutil.rtrim(AV9Ccartcod)),GXutil.URLEncode(GXutil.rtrim(AV8CCartdsc)),GXutil.URLEncode(GXutil.ltrimstr(AV12Tipartiid,4,0)),GXutil.URLEncode(GXutil.rtrim(AV13tipArtids)),GXutil.URLEncode(GXutil.rtrim(AV14CCColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV15CCColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV16CCCtc,2,0))}, new String[] {"EmprCod","CliCod","Tb1_Cod","CCArtCod","CCArtdsc","TipArtiId","TipArtiDs","CCColNom","CCColNum","CCCTc"})  ;
      }
      else
      {
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = AV11Clicod ;
         GXv_int3[0] = AV10Tb1_cod ;
         GXv_char4[0] = AV9Ccartcod ;
         GXv_char5[0] = AV14CCColNom ;
         GXv_int6[0] = AV15CCColNum ;
         GXv_int7[0] = AV16CCCtc ;
         GXv_int8[0] = AV17Intid ;
         GXv_char9[0] = AV18Intdsc ;
         new app.pcccno4insert(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_char5, GXv_int6, GXv_int7, GXv_int8, GXv_char9) ;
         ppintcc.this.A396EmprCod = GXv_char1[0] ;
         ppintcc.this.AV11Clicod = GXv_int2[0] ;
         ppintcc.this.AV10Tb1_cod = GXv_int3[0] ;
         ppintcc.this.AV9Ccartcod = GXv_char4[0] ;
         ppintcc.this.AV14CCColNom = GXv_char5[0] ;
         ppintcc.this.AV15CCColNum = GXv_int6[0] ;
         ppintcc.this.AV16CCCtc = GXv_int7[0] ;
         ppintcc.this.AV17Intid = GXv_int8[0] ;
         ppintcc.this.AV18Intdsc = GXv_char9[0] ;
         httpContext.wjLoc = formatLink("app.tcccc", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV11Clicod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10Tb1_cod,4,0)),GXutil.URLEncode(GXutil.rtrim(AV9Ccartcod)),GXutil.URLEncode(GXutil.rtrim(AV8CCartdsc)),GXutil.URLEncode(GXutil.ltrimstr(AV12Tipartiid,4,0)),GXutil.URLEncode(GXutil.rtrim(AV13tipArtids)),GXutil.URLEncode(GXutil.rtrim(AV14CCColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV15CCColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV16CCCtc,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV17Intid,4,0)),GXutil.URLEncode(GXutil.rtrim(AV18Intdsc))}, new String[] {})  ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppintcc.this.A396EmprCod;
      this.aP1[0] = ppintcc.this.AV11Clicod;
      this.aP2[0] = ppintcc.this.AV10Tb1_cod;
      this.aP3[0] = ppintcc.this.AV9Ccartcod;
      this.aP4[0] = ppintcc.this.AV8CCartdsc;
      this.aP5[0] = ppintcc.this.AV12Tipartiid;
      this.aP6[0] = ppintcc.this.AV13tipArtids;
      this.aP7[0] = ppintcc.this.AV14CCColNom;
      this.aP8[0] = ppintcc.this.AV15CCColNum;
      this.aP9[0] = ppintcc.this.AV16CCCtc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new short[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_int8 = new short[1] ;
      AV18Intdsc = "" ;
      GXv_char9 = new String[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16CCCtc ;
   private byte GXv_int7[] ;
   private short AV10Tb1_cod ;
   private short AV12Tipartiid ;
   private short GXv_int3[] ;
   private short AV17Intid ;
   private short GXv_int8[] ;
   private short Gx_err ;
   private int AV11Clicod ;
   private int AV15CCColNum ;
   private int GXv_int2[] ;
   private int GXv_int6[] ;
   private String A396EmprCod ;
   private String AV9Ccartcod ;
   private String AV8CCartdsc ;
   private String AV13tipArtids ;
   private String AV14CCColNom ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String AV18Intdsc ;
   private String GXv_char9[] ;
   private byte[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private int[] aP8 ;
}

