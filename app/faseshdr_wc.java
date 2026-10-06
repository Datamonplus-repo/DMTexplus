package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.faseshdr_wc", "/app.faseshdr_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class faseshdr_wc extends GXWebObjectStub
{
   public faseshdr_wc( )
   {
   }

   public faseshdr_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( faseshdr_wc.class ));
   }

   public faseshdr_wc( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new faseshdr_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new faseshdr_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Fases N Hdr";
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

