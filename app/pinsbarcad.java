package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinsbarcad extends GXProcedure
{
   public pinsbarcad( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinsbarcad.class ), "" );
   }

   public pinsbarcad( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        byte aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             byte aP3 )
   {
      pinsbarcad.this.A396EmprCod = aP0;
      pinsbarcad.this.AV10DisCod = aP1;
      pinsbarcad.this.AV9MaqCod = aP2;
      pinsbarcad.this.AV8FlagA = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV11bros ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BROS", ""), GXv_int2) ;
      pinsbarcad.this.GXt_int1 = GXv_int2[0] ;
      AV11bros = GXt_int1 ;
      GXv_char3[0] = A396EmprCod ;
      GXv_int4[0] = AV10DisCod ;
      GXv_char5[0] = AV9MaqCod ;
      GXv_int2[0] = AV8FlagA ;
      new app.pgenbamh(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5, GXv_int2) ;
      pinsbarcad.this.A396EmprCod = GXv_char3[0] ;
      pinsbarcad.this.AV10DisCod = GXv_int4[0] ;
      pinsbarcad.this.AV9MaqCod = GXv_char5[0] ;
      pinsbarcad.this.AV8FlagA = GXv_int2[0] ;
      if ( AV11bros == 1 )
      {
         new app.pcommit(remoteHandle, context).execute( ) ;
         httpContext.wjLoc = formatLink("app.tpbarcah", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV10DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","Mode"})  ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char5 = new String[1] ;
      GXv_int2 = new byte[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8FlagA ;
   private byte AV11bros ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short Gx_err ;
   private int AV10DisCod ;
   private int GXv_int4[] ;
   private String A396EmprCod ;
   private String AV9MaqCod ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
}

