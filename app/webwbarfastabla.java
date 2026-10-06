package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwbarfastabla", "/app.webwbarfastabla"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwbarfastabla extends GXWebObjectStub
{
   public webwbarfastabla( )
   {
   }

   public webwbarfastabla( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwbarfastabla.class ));
   }

   public webwbarfastabla( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwbarfastabla_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwbarfastabla_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento Fases (Hdr)";
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

