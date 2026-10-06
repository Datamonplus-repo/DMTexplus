package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.activarhdr", "/app.activarhdr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class activarhdr extends GXWebObjectStub
{
   public activarhdr( )
   {
   }

   public activarhdr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( activarhdr.class ));
   }

   public activarhdr( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new activarhdr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new activarhdr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Activar Hdr";
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

