package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttinagr", "/app.ttinagr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttinagr extends GXWebObjectStub
{
   public ttinagr( )
   {
   }

   public ttinagr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttinagr.class ));
   }

   public ttinagr( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttinagr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttinagr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "traver agrupacion tinte";
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

