package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrngrupos", "/app.ttrngrupos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrngrupos extends GXWebObjectStub
{
   public ttrngrupos( )
   {
   }

   public ttrngrupos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrngrupos.class ));
   }

   public ttrngrupos( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrngrupos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrngrupos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "GRUPOS";
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

