package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcserpau", "/app.wcserpau"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcserpau extends GXWebObjectStub
{
   public wcserpau( )
   {
   }

   public wcserpau( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcserpau.class ));
   }

   public wcserpau( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcserpau_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcserpau_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Fases Proceso";
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

