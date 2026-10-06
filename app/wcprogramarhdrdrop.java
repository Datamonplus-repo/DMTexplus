package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcprogramarhdrdrop", "/app.wcprogramarhdrdrop"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcprogramarhdrdrop extends GXWebObjectStub
{
   public wcprogramarhdrdrop( )
   {
   }

   public wcprogramarhdrdrop( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcprogramarhdrdrop.class ));
   }

   public wcprogramarhdrdrop( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcprogramarhdrdrop_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcprogramarhdrdrop_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCProgramar Hdr Drop";
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

