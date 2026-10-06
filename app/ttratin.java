package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttratin", "/app.ttratin"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttratin extends GXWebObjectStub
{
   public ttratin( )
   {
   }

   public ttratin( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttratin.class ));
   }

   public ttratin( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttratin_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttratin_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tratamientos Tinte";
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

