package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppartico extends GXProcedure
{
   public ppartico( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppartico.class ), "" );
   }

   public ppartico( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      ppartico.this.aP2 = new String[] {""};
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
      ppartico.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppartico.this.AV9Clicod = aP1[0];
      this.aP1 = aP1;
      ppartico.this.AV10Artcod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV8Suprema ;
      GXv_int2[0] = GXt_int1 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SUPREM", ""), GXv_int2) ;
      ppartico.this.GXt_int1 = GXv_int2[0] ;
      AV8Suprema = (byte)(GXt_int1) ;
      if ( AV8Suprema == 1 )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_int2[0] = AV9Clicod ;
         GXv_char4[0] = AV10Artcod ;
         new app.psuu001(remoteHandle, context).execute( GXv_char3, GXv_int2, GXv_char4) ;
         ppartico.this.A396EmprCod = GXv_char3[0] ;
         ppartico.this.AV9Clicod = GXv_int2[0] ;
         ppartico.this.AV10Artcod = GXv_char4[0] ;
      }
      httpContext.wjLoc = formatLink("app.tartprl", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV9Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV10Artcod))}, new String[] {"EmprCod","CliCod","ArtCod"})  ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int2[0] = AV9Clicod ;
      GXv_char3[0] = AV10Artcod ;
      new app.pmodels(remoteHandle, context).execute( GXv_char4, GXv_int2, GXv_char3) ;
      ppartico.this.A396EmprCod = GXv_char4[0] ;
      ppartico.this.AV9Clicod = GXv_int2[0] ;
      ppartico.this.AV10Artcod = GXv_char3[0] ;
      httpContext.wjLoc = formatLink("app.tartico", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV9Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV10Artcod))}, new String[] {"EmprCod","CliCod","ArtCod"})  ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppartico.this.A396EmprCod;
      this.aP1[0] = ppartico.this.AV9Clicod;
      this.aP2[0] = ppartico.this.AV10Artcod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char4 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8Suprema ;
   private short Gx_err ;
   private int AV9Clicod ;
   private int GXt_int1 ;
   private int GXv_int2[] ;
   private String A396EmprCod ;
   private String AV10Artcod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
}

