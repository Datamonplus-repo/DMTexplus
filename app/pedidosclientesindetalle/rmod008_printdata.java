package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.rmod008_printdata", "/app.pedidosclientesindetalle.rmod008_printdata"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rmod008_printdata extends GXWebObjectStub
{
   public rmod008_printdata( )
   {
   }

   public rmod008_printdata( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rmod008_printdata.class ));
   }

   public rmod008_printdata( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rmod008_printdata_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rmod008_printdata_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "RMOD008_Print Data";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

