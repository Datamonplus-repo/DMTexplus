package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.adownloadbinary", "/app.adownloadbinary"})
@jakarta.servlet.annotation.MultipartConfig
public final  class adownloadbinary extends GXWebObjectStub
{
   public adownloadbinary( )
   {
   }

   public adownloadbinary( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( adownloadbinary.class ));
   }

   public adownloadbinary( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new adownloadbinary_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new adownloadbinary_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Download Binary";
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

