package app.datamon ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pget_userinfo extends GXProcedure
{
   public pget_userinfo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pget_userinfo.class ), "" );
   }

   public pget_userinfo( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( )
   {
      pget_userinfo.this.aP0 = new String[] {""};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( String[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String[] aP0 )
   {
      pget_userinfo.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Parms.add(httpContext.getMessage( "{Menu}", ""), 0);
      AV9Parms.add("1.0.0.0", 0);
      AV9Parms.add(AV10GUID.toString(), 0);
      AV11HTTPResponse.addString(AV9Parms.toJSonString(false));
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pget_userinfo.this.AV8UsuParm;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8UsuParm = "" ;
      AV9Parms = new GXSimpleCollection<String>(String.class, "internal", "");
      AV10GUID = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      AV11HTTPResponse = httpContext.getHttpResponse();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV8UsuParm ;
   private java.util.UUID AV10GUID ;
   private String[] aP0 ;
   private com.genexus.internet.HttpResponse AV11HTTPResponse ;
   private GXSimpleCollection<String> AV9Parms ;
}

